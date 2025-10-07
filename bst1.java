import java.util.ArrayList;

public class bst1 {

    static class node {
        int data;
        node left, right;

        node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // INSERT
    public static node insert(node root, int val) {
        if (root == null) {
            return new node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // INORDER TRAVERSAL
    public static void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // SEARCH
    public static boolean search(node root, int key) {
        if (root == null) return false;

        if (root.data == key) return true;

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // DELETE NODE
    public static node delete(node root, int val) {
        if (root == null) return null; // ✅ prevent null pointer

        if (val < root.data) {
            root.left = delete(root.left, val);
        } else if (val > root.data) {
            root.right = delete(root.right, val);
        } else {
            // Case 1: leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: one child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: two children
            node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    // FIND INORDER SUCCESSOR
    public static node findInorderSuccessor(node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // PRINT IN RANGE
    public static void printInRange(node root, int k1, int k2) {
        if (root == null) return;

        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }
    }

    // PRINT SINGLE PATH
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    // PRINT ALL ROOT TO LEAF PATHS
    public static void printRootToLeaf(node root, ArrayList<Integer> path) {
        if (root == null) return;

        path.add(root.data);

        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }

        path.remove(path.size() - 1); // ✅ backtrack after recursion
    }

    public static void main(String args[]) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.println(search(root, 7) ? "Found" : "Not found");

        root = delete(root, 14);
        System.out.print("After deleting 14: ");
        inorder(root);
        System.out.println();

        System.out.print("Nodes in range [5, 12]: ");
        printInRange(root, 5, 12);
        System.out.println();

        System.out.println("Root to leaf paths:");
        printRootToLeaf(root, new ArrayList<>());
    }
}
