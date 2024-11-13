//------------>94. Binary Tree Inorder Traversal <---------
import com.sun.source.tree.Tree;

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

    // leetcode function
    static List<Integer> li = new ArrayList<>();
    public static List<Integer> inorderTraversal(TreeNode root) {
            if (root == null) return li;
            inorderTraversal(root.left);
            li.add(root.val);
            inorderTraversal(root.right);

            return li;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(inorderTraversal(root));
    }
}