/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
           // Store parent pointers
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        
        // Store visited nodes
        Set<TreeNode> visited = new HashSet<>();
        
        // DFS to store all parent relationships
        Stack<TreeNode> stack = new Stack<>();
        parent.put(root, null);
        stack.push(root);
        
        // Process until we find both p and q
        while (!parent.containsKey(p) || !parent.containsKey(q)) {
            TreeNode node = stack.pop();
            
            if (node.left != null) {
                parent.put(node.left, node);
                stack.push(node.left);
            }
            if (node.right != null) {
                parent.put(node.right, node);
                stack.push(node.right);
            }
        }
        
        // Move up from p and mark all ancestors
        while (p != null) {
            visited.add(p);
            p = parent.get(p);
        }
        
        // Move up from q until we find first common ancestor
        while (!visited.contains(q)) {
            q = parent.get(q);
        }
        
        return q;
    }
    
}