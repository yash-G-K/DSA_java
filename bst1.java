
public class bst1{
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static node insert(node root,int val){
      if(root == null){
        root = new node(val);
        return root;
      }
      if(root.data>val){
        //left subtree
        root.left = insert(root.left,val);
    }else{
        //right subtree
        root.right = insert(root.right,val);
    }
    return root;
    }

    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //searching a node int BST
    public static boolean search(node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }

    

    /// for deleting the node in BST
    public static node delete(node root,int val){
        if(root.data<val){
            root.right=delete(root.right,val);
        }else if(root.data>val){
            root.left=delete(root.left,val);
        }else{
            //cases to be handled
            //case 1: leaf node
            if(root.left==null && root.right==null){
                return null;
            }
            // acse2: single child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            //case3: both children
            node IS = findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
    }
    return root;
    }

        //finding inorder successor
    public static node findInorderSuccessor(node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void main(String args[]){
        int values[]={8,5,3,1,4,6,10,11,14};
        node root=null; 

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        if(search(root,7)){
            System.out.println("found");    
        }else{
            System.out.println("not found");
        }

        root=delete(root,14);
        inorder(root);

    }

}