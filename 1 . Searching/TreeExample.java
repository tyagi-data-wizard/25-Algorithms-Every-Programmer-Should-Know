class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class TreeExample {
    public static int findLevel(TreeNode root, int target, int level) {
        if (root == null) {
            return -1; // Node not found
        }

        if (root.val == target) {
            return level; // Node found, return its level
        }

        // Search for the node in the left subtree
        int leftLevel = findLevel(root.left, target, level + 1);
        if (leftLevel != -1) {
            return leftLevel; // Node found in the left subtree
        }

        // If not found in the left subtree, search in the right subtree
        return findLevel(root.right, target, level + 1);
    }

    public static void main(String[] args) {
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int targetNodeValue = 5;
        int level = findLevel(root, targetNodeValue, 1);

        if (level != -1) {
            System.out.println("Level of node with value " + targetNodeValue + " is " + level);
        } else {
            System.out.println("Node with value " + targetNodeValue + " not found in the tree.");
        }
    }
}
