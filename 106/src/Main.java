
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
    //function used in leetocde
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> inMap = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            inMap.put(inorder[i],i);
        }
        TreeNode root = createTree(postorder , postorder.length - 1, 0, inorder, 0, inorder.length - 1, inMap);
        return root;
    }
    public static TreeNode createTree(int[] postorder, int postStart,int postEnd, int[] inorder, int inStart, int inEnd, Map<Integer,Integer> inMap){
        if(postStart < postEnd|| inStart > inEnd){
            return null;
        }

        TreeNode root = new TreeNode(postorder[postStart]);
        int inRoot = inMap.get(root.val);
        int numsright = inEnd - inRoot;   // numbers of right element in right subree of root node

        root.left = createTree(postorder, postStart - numsright - 1,postEnd, inorder, inStart, inRoot - 1,inMap);
        root.right = createTree(postorder, postStart - 1, postStart - numsright, inorder, inRoot + 1, inEnd,inMap);
        return root;
    }
    public static void main(String[] args) {
        int[] postorder ={9,15,7,20,3};
        int[] inorder = {9,3,15,20,7};

        buildTree(inorder,postorder);
    }
}