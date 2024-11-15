//---------------->144. Binary Tree Preorder Traversal<-----------
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

    //leetcode function that solve problem
    static  List<Integer> li = new LinkedList<>();

    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root == null)
            return li;
        if (root != null)
            li.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return li;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("The preOrder traversal of tree is : " + preorderTraversal(root));
    }
}