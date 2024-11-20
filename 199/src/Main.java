//------------>199. Binary Tree Right Side View<----------

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

    static List<Integer> li = new ArrayList<>();
    public static List<Integer> rightSideView(TreeNode root) {
        if (root == null)
            return li;
        Queue<TreeNode> a = new LinkedList<>();
        a.add(root);
        while (!a.isEmpty()) {
            int size = a.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = a.remove();
                if (temp.left != null)
                    a.add(temp.left);
                if (temp.right != null)
                    a.add(temp.right);
                if (i == size - 1) {
                    li.add(temp.val);
                }
            }
        }

        return li;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        System.out.println(rightSideView(root));
    }
}