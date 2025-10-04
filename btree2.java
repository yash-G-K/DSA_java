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
        int height, diameter;
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

    // Optimized diameter
    static class Info {
        int height, diameter;
        Info(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static Info diameter2(btree root) {
        if (root == null) return new Info(0, 0);

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int dia = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height + rightInfo.height + 1);
        int ht = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new Info(ht, dia);
    }

    // Check if identical
    public static boolean isIdentical(btree node, btree subroot) {
        if (node == null && subroot == null) return true;
        if (node == null || subroot == null || node.data != subroot.data) return false;

        return isIdentical(node.left, subroot.left) && isIdentical(node.right, subroot.right);
    }

    // Check if subroot is subtree of root
    public static boolean subtree(btree root, btree subroot) {
        if (root == null) return false;
        if (subroot == null) return true;

        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }

        return subtree(root.left, subroot) || subtree(root.right, subroot);
    }

public static void main(String args[]) {
    int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    binarytree tree = new binarytree();

    binarytree.idx = -1;
    btree root = tree.buildtree(nodes);

    System.out.println("Diameter of the tree: " + tree.diameter(root).diameter);
    System.out.println("Diameter of the tree (optimized): " + diameter2(root).diameter);

    int subnodes[] = {3,-1,6,-1,-1};
    binarytree subTree = new binarytree();

    binarytree.idx = -1; // ✅ reset before building new tree
    btree subroot = subTree.buildtree(subnodes);

    System.out.println("Is subtree: " + subtree(root, subroot));
}
}

// Top view of a binary tree

