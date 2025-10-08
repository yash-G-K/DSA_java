// import java.util.ArrayList;

// public class bst1 {

//     static class node {
//         int data;
//         node left, right;

//         node(int data) {
//             this.data = data;
//             left = right = null;
//         }
//     }

//     // INSERT
//     public static node insert(node root, int val) {
//         if (root == null) {
//             return new node(val);
//         }
//         if (val < root.data) {
//             root.left = insert(root.left, val);
//         } else {
//             root.right = insert(root.right, val);
//         }
//         return root;
//     }

//     // INORDER TRAVERSAL
//     public static void inorder(node root) {
//         if (root == null) {
//             return;
//         }
//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }

//     // SEARCH
//     public static boolean search(node root, int key) {
//         if (root == null) return false;

//         if (root.data == key) return true;

//         if (key < root.data) {
//             return search(root.left, key);
//         } else {
//             return search(root.right, key);
//         }
//     }

//     // DELETE NODE
//     public static node delete(node root, int val) {
//         if (root == null) return null; // ✅ prevent null pointer

//         if (val < root.data) {
//             root.left = delete(root.left, val);
//         } else if (val > root.data) {
//             root.right = delete(root.right, val);
//         } else {
//             // Case 1: leaf node
//             if (root.left == null && root.right == null) {
//                 return null;
//             }
//             // Case 2: one child
//             if (root.left == null) return root.right;
//             if (root.right == null) return root.left;

//             // Case 3: two children
//             node IS = findInorderSuccessor(root.right);
//             root.data = IS.data;
//             root.right = delete(root.right, IS.data);
//         }
//         return root;
//     }

//     // FIND INORDER SUCCESSOR
//     public static node findInorderSuccessor(node root) {
//         while (root.left != null) {
//             root = root.left;
//         }
//         return root;
//     }

//     // PRINT IN RANGE
//     public static void printInRange(node root, int k1, int k2) {
//         if (root == null) return;

//         if (root.data >= k1 && root.data <= k2) {
//             printInRange(root.left, k1, k2);
//             System.out.print(root.data + " ");
//             printInRange(root.right, k1, k2);
//         } else if (root.data < k1) {
//             printInRange(root.right, k1, k2);
//         } else {
//             printInRange(root.left, k1, k2);
//         }
//     }

//     // PRINT SINGLE PATH
//     public static void printPath(ArrayList<Integer> path) {
//         for (int i = 0; i < path.size(); i++) {
//             System.out.print(path.get(i) + "->");
//         }
//         System.out.println("null");
//     }

//     // PRINT ALL ROOT TO LEAF PATHS
//     public static void printRootToLeaf(node root, ArrayList<Integer> path) {
//         if (root == null) return;

//         path.add(root.data);

//         if (root.left == null && root.right == null) {
//             printPath(path);
//         } else {
//             printRootToLeaf(root.left, path);
//             printRootToLeaf(root.right, path);
//         }

//         path.remove(path.size() - 1); // ✅ backtrack after recursion
//     }

//    // is the bst is valid or  not
//     public static boolean isvaildbst(node root, node min, node max){
//         if(root == null) return true;

//         if(min != null  && root.data <= min.data){
//             return false;
//         }

//         if(max != null && root.data <= max.data){
//             return false;
//         }

//         return isvaildbst(root.left, min, root) && 
//         isvaildbst(root.right, root,max);

//     }

//     //mirror a binary search tree


//     public static void main(String args[]) {
//         int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
//         node root = null;

//         for (int val : values) {
//             root = insert(root, val);
//         }

//         System.out.print("Inorder: ");
//         inorder(root);
//         System.out.println();

//         System.out.println(search(root, 7) ? "Found" : "Not found");

//         root = delete(root, 14);
//         System.out.print("After deleting 14: ");
//         inorder(root);
//         System.out.println();

//         System.out.print("Nodes in range [5, 12]: ");
//         printInRange(root, 5, 12);
//         System.out.println();

//         System.out.println("Root to leaf paths:");
//         printRootToLeaf(root, new ArrayList<>());

//         System.out.println(isvaildbst(root, null, null));

//     }
// }


// mirror of the binary search tree
public class bst1 {

    static class node {
        int data;
        node left, right;

        node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Mirror the binary search tree
    public static node mirror(node root){
        if(root == null) return null;

        node leftsubtree = mirror(root.left);
        node rightsubtree = mirror(root.right);

        root.left = rightsubtree;
        root.right = leftsubtree;

        return root;
    }

    // Preorder traversal
    public static void preorder(node root){
        if(root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        node root = new node(8);
        root.left = new node(5);
        root.right = new node(10);
        root.left.left = new node(3);
        root.left.right = new node(6);
        root.right.right = new node(11);

        root = mirror(root);
        preorder(root);
    }
}

 