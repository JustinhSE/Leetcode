# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        lst = []
        def inorder(node):
            if len(lst) > k:
                return
            if node:
                inorder(node.left)
                lst.append(node.val)
                inorder(node.right)
            return
        inorder(root)
        return lst[k-1]
        


