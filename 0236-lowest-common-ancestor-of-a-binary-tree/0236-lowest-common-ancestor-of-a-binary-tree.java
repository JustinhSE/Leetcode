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
    private Map<TreeNode, Integer> entry = new HashMap<>();
    private Map<TreeNode, Integer> exit = new HashMap<>();
    private Map<TreeNode, TreeNode> parent = new HashMap<>();
    private int time = 0;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Step 1: Preprocessing with DFS to calculate entry and exit times
        dfs(root, null);

        // Step 2: Find LCA using ancestor checks
        while (!isAncestor(p, q)) {
            p = parent.get(p);
        }
        return p;
    }

    private void dfs(TreeNode node, TreeNode par) {
        if (node == null) return;

        // Record entry time
        time++;
        entry.put(node, time);

        // Record parent of the current node
        parent.put(node, par);

        // Recur for left and right children
        dfs(node.left, node);
        dfs(node.right, node);

        // Record exit time
        time++;
        exit.put(node, time);
    }

    private boolean isAncestor(TreeNode u, TreeNode v) {
        return entry.get(u) <= entry.get(v) && exit.get(v) <= exit.get(u);
    }
}
