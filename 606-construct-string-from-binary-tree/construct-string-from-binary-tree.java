class Solution {
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        dfs(root, result);
        return result.toString();
    }
    public void dfs(TreeNode root, StringBuilder result) {
        if (root == null) {
            return;
        }
        result.append(root.val);
        if (root.left != null || root.right != null) {
            result.append('(');
            dfs(root.left, result);
            result.append(')');
        }
        if (root.right != null) {
            result.append('(');
            dfs(root.right, result);
            result.append(')');
        }
    }
}