# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        lst = []
        def inorder(node):
            if node:
                inorder(node.left)
                lst.append(node.val)
                inorder(node.right)
            return
        inorder(root)

        return sorted(lst) == lst and len(set(lst)) == len(lst)

        