/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static boolean check(TreeNode root, int tar){
        if(root==null) return false;
        if(root.left==null && root.right==null){
            if(root.val==tar) return true;
            else return false;
        }

        return check(root.left,tar) || check(root.right,tar);
    }

    static TreeNode delete(TreeNode root, int tar){
        if(root==null) return null;
        if(root.left==null && root.right==null && root.val==tar) return null;

        TreeNode left = delete(root.left,tar);
        TreeNode right = delete(root.right,tar);
        root.left = left;
        root.right = right;
        return root;

    }

    
    public TreeNode removeLeafNodes(TreeNode root, int tar) {
        if(root.left==null && root.right==null && root.val==tar) return null;

        TreeNode ans = root;

        while(check(ans,tar)){
            ans = delete(ans,tar);
        }
        return ans;

    }
}