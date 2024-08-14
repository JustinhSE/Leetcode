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
    ArrayList<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        recur(root, k);
        return list.get(k-1);
    }
    public void recur(TreeNode root, int k){
        if(root.left != null){
            recur(root.left, k);
        }
        list.add(root.val);
        if(root.right != null){
            recur(root.right,k);
        }
    }
}