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

       //function used in leetcode
        public static boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null)
                return true;
            if (p == null || q == null || p.val != q.val)
                return false;
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }


    public static void main(String[] args) {
           TreeNode root1 = new TreeNode(1);
           root1.left = new TreeNode(2);
           root1.right = new TreeNode(3);

           TreeNode root2 = new TreeNode(1);
           root2.left = new TreeNode(2);
           root2.right = new TreeNode(3);

        System.out.println("The tree root1 and root2 is smae :" + isSameTree(root1,root2));
    }
}