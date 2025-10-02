// // preoreder tree traversal 
// import java.util.*;
// public class binarytree{
//     static class node{
//         int data;
//         node left;
//         node right;

//         node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class binarytree1{
//         static int idx = -1;
//         public static node buildtree(int nodes[]){
//             idx++;
//             if(nodes[idx] == -1){
//                 return null;
//             }
//             node newnode = new node(nodes[idx]);
//             newnode.left = buildtree(nodes);
//             newnode.right = buildtree(nodes);
//             return newnode;   
//         }
//     }
//     public static void preorder(node root){
//         if(root == null){
//             return;
//         }
//         System.out.print(root.data + " ");
//         preorder(root.left);
//         preorder(root.right);
//     }

//     //inorder treversal of a tree
//     public static void inorder(node root){
//         if(root == null){
//             return;
//         }
//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }

//     //postorder traversal of a tree
//     public static void postorder(node root){
//         if(root == null){
//             return;
//         }
//         postorder(root.left);
//         postorder(root.right);
//         System.out.print(root.data + " ");
//     }

//     // level order traversal of a tree
//     public static void levelorder(node root) {
//     if (root == null) {
//         return;
//     }
//     Queue<node> q = new LinkedList<>();
//     q.add(root);
//     q.add(null); // marker for end of level

//     while (!q.isEmpty()) {
//         node curr = q.remove();
//         if (curr == null) {
//             System.out.println(); // new line after each level
//             if (q.isEmpty()) {
//                 break;
//             } else {
//                 q.add(null); // add marker for next level
//             }
//         } else {
//             System.out.print(curr.data + " ");
//             if (curr.left != null) {
//                 q.add(curr.left);
//             }
//             if (curr.right != null) {
//                 q.add(curr.right);
//             }
//         }
//     }
// }

// public static void main(String args[]){
//     int nodes [] = {1,2,3,-1,-1,4,-1,-1,5,6,-1,-1,7,-1,-1};
//     binarytree tree = new binarytree();
//     node root = binarytree1.buildtree(nodes);
//     System.out.println("Preorder traversal of a tree");
//     tree.preorder(root);
//     System.err.println("");
//     System.out.println("Inorder traversal of a tree");
//     tree.inorder(root);
//     System.err.println("");
//     System.out.println("postorder traversal of a tree");
//     tree.postorder(root);

//     System.err.println("");
//     System.out.println("level order traversal of a tree");
//     tree.levelorder(root);

// }
// }


//height of a tree
public class binarytree {
    static class node {
        int data;
        node left, right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    

    // method to calculate height
    public static int height(node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // total number of nodes in a tree
    public static int nodecount(node root) {
        if (root == null) {
            return 0;
        }
       int lcount= nodecount(root.left) ;
         int rcount= nodecount(root.right);
            return lcount + rcount + 1;
    }

    //sum of the nodes in a tree
    public static int sumofnodes(node root) {
        if (root == null) {
            return 0;
        }
       int lsum= sumofnodes(root.left) ;
         int rsum= sumofnodes(root.right);
            return lsum + rsum + root.data;
    }

    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5); // fixed typo
        root.right.left = new node(6);
        root.right.right = new node(7);

//         1
//       /   \
//      2     3
//     / \   / \
//    4   5 6   7

        System.out.println("Height of tree: " + height(root));
        System.out.println("Total number of nodes in tree: " + nodecount(root));
        System.out.println("Sum of all nodes in tree: " + sumofnodes(root));

    }
}


