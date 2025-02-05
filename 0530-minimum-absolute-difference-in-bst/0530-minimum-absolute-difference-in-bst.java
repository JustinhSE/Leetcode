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
    List<Integer> list = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list.size()-1; i++){
            min = (list.get(i+1) - list.get(i)) < min ? (list.get(i+1) - list.get(i)) : min;
        }
        return min;
    }
    public void inorder(TreeNode root){
        if(root.left != null){
            inorder(root.left);
        }
        list.add(root.val);
        if(root.right != null){
            inorder(root.right);
        }
    }
}