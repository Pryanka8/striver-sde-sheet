
// 700. Search in a Binary Search Tree
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class DaySix {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode ans = null;
        if (root.val == val) {
            return root;
        }
        if (root.left != null) {
            ans = searchBST(root.left, val);
        }
        if (root.right != null && ans == null) {
            ans = searchBST(root.right, val);
        }

        return ans;
    }
}