/*You are given a binary tree and a target value. Implement a BFS algorithm to find the target value in the binary tree and return true if the target exists in the tree, or false otherwise.*/

  import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class BFSSearchBinaryTree {

    public static boolean bfsSearch(TreeNode root, int target) {
        if (root == null) {
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current.val == target) {
                return true;
            }

            if (current.left != null) {
                queue.offer(current.left);
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        int target = 4;
        boolean result = bfsSearch(root, target);
        System.out.println("Is " + target + " present in the binary tree? " + result);
    }
}
``
