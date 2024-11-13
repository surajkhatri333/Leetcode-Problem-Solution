import javax.swing.tree.TreeCellRenderer;
import java.time.temporal.Temporal;

public class Main {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // leetcode function to solve problem
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;             // check null case
        if(root.left == null && root.right == null) return root.val == targetSum;     // retrun true is the targetSum exist in path
        int remainingSum = targetSum - root.val;                           //subtract root value from targetSum each recursive call;
        boolean leftsum = hasPathSum(root.left,remainingSum);
        boolean rightsum = hasPathSum(root.right,remainingSum);
        return (leftsum || rightsum);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;
        System.out.println("The given tree has path with targetSum : " + hasPathSum(root,targetSum));
    }
}