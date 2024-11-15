
import java.util.*;
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

    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> li = new ArrayList<>();


    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return result;
        li.add(root.val);
        if (root.left == null && root.right == null && root.val == targetSum) {
            result.add(new ArrayList<>(li));
        }
        int remainingSum = targetSum - root.val;
        pathSum(root.left, remainingSum);
        pathSum(root.right, remainingSum);
        li.remove(li.size()-1);

        return result;
    }
    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;
        System.out.println(pathSum(root,targetSum));
    }
}