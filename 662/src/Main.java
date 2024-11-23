

import java.sql.SQLOutput;
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
    private static  class pair{
        TreeNode root;
        int idx;

        pair(TreeNode root, int idx) {
            this.root = root;
            this.idx = idx;
        }
    }
    public static int widthOfBinaryTree(TreeNode root) {
        Queue<pair> q  = new LinkedList<>();
        int idx = 0;
        int ans = Integer.MIN_VALUE;
        q.add(new pair(root,idx));
        int first = 0 , last = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                pair curr = q.remove();

                if(i == 0){
                    first = curr.idx;
                }
                if(i == size - 1){
                    last = curr.idx;
                }

                if(curr.root.left != null){
                    q.add(new pair(curr.root.left, 2 * curr.idx + 1));
                }
                if(curr.root.right != null){
                    q.add(new pair(curr.root.right, 2 * curr.idx +2));
                }

            }
            ans = Math.max(ans, (last - first + 1));
        }
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        System.out.println("The maximum width of tree is : "+ widthOfBinaryTree(root));
    }
}