// Optimized version
public class btree2 {
    static class btree {
        int data;
        btree left, right;
        btree(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class TreeInfo {
        int height;
        int diameter;
        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    static class binarytree {
        static int idx = -1;

        public static btree buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) return null;

            btree newnode = new btree(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);
            return newnode;
        }

        public static TreeInfo diameter(btree root) {
            if (root == null) return new TreeInfo(0, 0);

            TreeInfo left = diameter(root.left);
            TreeInfo right = diameter(root.right);

            int myHeight = Math.max(left.height, right.height) + 1;

            int diamThroughRoot = left.height + right.height + 1;
            int myDiameter = Math.max(diamThroughRoot, Math.max(left.diameter, right.diameter));

            return new TreeInfo(myHeight, myDiameter);
        }
    }

    public static void main(String args[]) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree tree = new binarytree();
        btree root = tree.buildtree(nodes);

        System.out.println("Diameter of the tree: " + tree.diameter(root).diameter);
    }
}
