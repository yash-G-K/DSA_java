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
        //kth kevel of a tree
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

    // print path from root to a node
    public static boolean getPath(btree root, int n, ArrayList<btree> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if (foundLeft || foundRight) {
            return true;
        }
        path.remove(path.size() - 1); // backtracking
        return false;
    }

    // ancestors of a node in a binary tree
    public static btree lca(btree root, int n1, int n2) {
        ArrayList<btree> path1 = new ArrayList<>();
        ArrayList<btree> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        // last common ancestor
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != (path2.get(i))) {
                break;
            }
        }
        // last equal node
        btree lca = path1.get(i - 1);
        return lca;
    }

    // approach 2 for lca
    public static btree lca2(btree root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        btree leftlca = lca2(root.left, n1, n2);
        btree rightlca = lca2(root.right, n1, n2);

        if(rightlca == null){
            return leftlca;
        }
        if(leftlca == null){
            return rightlca;
        }
        return root;
    }

    // find level of a node in a binary tree
    public static int findlevel(btree root, int k){
        if(root == null){
            return -1;
        }
        if(root.data == k){
            return 0;
        }
        int leftlevel = findlevel(root.left, k);
        int rightlevel = findlevel(root.right, k);

        if(leftlevel == -1 && rightlevel == -1){
            return -1;
        }
        else if(leftlevel == -1){
            return rightlevel + 1;
        }
        else{
            return leftlevel + 1;
        }

    }
    //min distance between two nodes
    public static int mindist(btree root, int n1, int n2){
        btree lca = lca2(root, n1, n2);
        int dist1 = findlevel(lca, n1);
        int dist2 = findlevel(lca, n2);
        return dist1 + dist2;
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

        int k = 2; // Level to print (root is level 0)
        System.out.println("Nodes at level " + k + ":");
        binarytree.klevel(root, 0, k);

        int n1 = 4, n2 = 6;
        System.out.println("\nLCA of " + n1 + " and " + n2 + ": " + lca(root, n1, n2).data);

        System.out.println("LCA of " + n1 + " and " + n2 + " using approach 2: " + lca2(root, n1, n2).data);

        int dist = mindist(root, n1, n2);
        System.out.println("Minimum distance between " + n1 + " and " + n2 + ": " + dist);      
    }
}
