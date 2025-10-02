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
public static void main(String args[]){
    int nodes [] = {1,2,3,-1,-1,4,-1,-1,5,6,-1,-1,7,-1,-1};
    binarytree tree = new binarytree();
    node root = binarytree1.buildtree(nodes);
    System.out.println(root.data);
}
}