# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def getMinimumDifference(self, root: Optional[TreeNode]) -> int:
        queue = deque([root])
        lst = []
        while queue:
            size = len(queue)
            for i in range(size):
                node = queue.popleft()
                lst.append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)

        lst.sort()
        min = float('inf')
        for i in range(1,len(lst)):
            temp = lst[i] - lst[i-1] 
            if temp < min:
                min = temp
        return min

            
        


