// preoreder tree traversal 
public class binarytree{
    static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binarytree1{
        static int idx = -1;
        public static node buildtree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            node newnode = new node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);
            return newnode;   
        }
    }
    public static void preorder(node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    //inorder treversal of a tree
    public static void inorder(node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //postorder traversal of a tree
    public static void postorder(node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

public static void main(String args[]){
    int nodes [] = {1,2,3,-1,-1,4,-1,-1,5,6,-1,-1,7,-1,-1};
    binarytree tree = new binarytree();
    node root = binarytree1.buildtree(nodes);
    System.out.println("Preorder traversal of a tree");
    tree.preorder(root);
    System.err.println("");
    System.out.println("Inorder traversal of a tree");
    tree.inorder(root);
    System.err.println("");
    System.out.println("postorder traversal of a tree");
    tree.postorder(root);
}
}


