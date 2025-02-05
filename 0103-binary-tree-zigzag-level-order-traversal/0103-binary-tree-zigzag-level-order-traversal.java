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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){return list;}
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean zig = true;
        while(!queue.isEmpty()){
            int size=  queue.size();
            List<Integer> nodes = new ArrayList<>();
            for(int i = 0 ; i < size; i++){
                TreeNode node = queue.poll();
                if(zig){
                    nodes.add(node.val);
                }
                if(!zig){
                    nodes.add(0,node.val);
                }
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            zig = !zig;
            list.add(nodes);
        }
        return list;
    }
}