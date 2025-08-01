# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:
        if not root:
            return []
        queue = deque([root])
        result = []
        while queue:
            num = 0
            size = len(queue)
            for i in range(size):
                node = queue.popleft()
                num += node.val
                if node.left:
                    queue.append(node.left)
                if node.right: 
                    queue.append(node.right)
            result.append(num / size)
        return result
             
        