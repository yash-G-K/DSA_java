import java.util.*;

public class btree3 {
    static class btree {
        int data;
        btree left, right;

        btree(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class binarytree {
        // Kth level of a tree
        public static void klevel(btree root, int level, int k) {
            if (root == null) {
                return;
            }
            if (level == k) {
                System.out.print(root.data + " ");
                return;
            }
            klevel(root.left, level + 1, k);
            klevel(root.right, level + 1, k);
        }
    }

    // Print path from root to a given node
    public static boolean getPath(btree root, int n, ArrayList<btree> path) {
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        if (getPath(root.left, n, path) || getPath(root.right, n, path)) {
            return true;
        }

        path.remove(path.size() - 1); // backtrack
        return false;
    }

    // LCA using path comparison
    public static btree lca(btree root, int n1, int n2) {
        ArrayList<btree> path1 = new ArrayList<>();
        ArrayList<btree> path2 = new ArrayList<>();

        if (!getPath(root, n1, path1) || !getPath(root, n2, path2)) {
            return null; // if either node not found
        }

        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        return path1.get(i - 1);
    }

    // LCA - Approach 2 (optimized)
    public static btree lca2(btree root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        btree leftlca = lca2(root.left, n1, n2);
        btree rightlca = lca2(root.right, n1, n2);

        if (leftlca == null) {
            return rightlca;
        }
        if (rightlca == null) {
            return leftlca;
        }

        return root;
    }

    // Find level of a node in a binary tree
    public static int findlevel(btree root, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == k) {
            return 0;
        }

        int leftlevel = findlevel(root.left, k);
        int rightlevel = findlevel(root.right, k);

        if (leftlevel == -1 && rightlevel == -1) {
            return -1;
        } else if (leftlevel == -1) {
            return rightlevel + 1;
        } else {
            return leftlevel + 1;
        }
    }

    // Minimum distance between two nodes
    public static int mindist(btree root, int n1, int n2) {
        btree lca = lca2(root, n1, n2);
        int dist1 = findlevel(lca, n1);
        int dist2 = findlevel(lca, n2);
        return dist1 + dist2;
    }

    // Kth ancestor of a node in a binary tree
    public static int kthancestor(btree root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftdist = kthancestor(root.left, n, k);
        int rightdist = kthancestor(root.right, n, k);

        if (leftdist == -1 && rightdist == -1) {
            return -1;
        }

        int max = Math.max(leftdist, rightdist);
        if (max + 1 == k) {
            System.out.println(root.data);
        }

        return max + 1;
    }

    // Transform tree into sum tree
    public static int transform(btree root) {
        if (root == null) {
            return 0;
        }

        int leftsum = transform(root.left);
        int rightsum = transform(root.right);

        int oldValue = root.data;
        root.data = leftsum + rightsum;
        return oldValue + root.data;
    }

    // Preorder traversal
    public static void preorder(btree root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        // ✅ Manual tree creation
        btree root = new btree(1);
        root.left = new btree(2);
        root.right = new btree(3);
        root.left.left = new btree(4);
        root.left.right = new btree(5);
        root.right.left = new btree(6);
        root.right.right = new btree(7);

        // Uncomment any section to test:

        // int k = 2;
        // System.out.println("Nodes at level " + k + ":");
        // binarytree.klevel(root, 0, k);

        // int n1 = 4, n2 = 6;
        // System.out.println("\nLCA of " + n1 + " and " + n2 + ": " + lca(root, n1, n2).data);
        // System.out.println("LCA (optimized): " + lca2(root, n1, n2).data);
        // System.out.println("Minimum distance between " + n1 + " and " + n2 + ": " + mindist(root, n1, n2));

        // int k1 = 2;
        // System.out.print(k1 + "th ancestor of " + n1 + ": ");
        // kthancestor(root, n1, k1);

        transform(root);
        System.out.println("Preorder traversal of the transformed sum tree:");
        preorder(root);
        System.out.println();
    }
}
