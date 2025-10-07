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
    }
}
