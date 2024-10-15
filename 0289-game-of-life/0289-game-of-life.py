class Solution:
    def gameOfLife(self, board: List[List[int]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        directions = [(1,0), (-1,0), (0,1), (0,-1), (1,1), (1,-1), (-1,1), (-1,-1)]
        deadcells = []
        livecells = [] 
        def isBound(r,c):
            return 0 <= r < len(board) and 0 <= c < len(board[0])

        for r in range(len(board)):
            for c in range(len(board[0])):
                count = 0

                for dr, dc in directions:
                    new_r = dr + r
                    new_c = dc+ c
                    if isBound(new_r, new_c):
                        count += board[new_r][new_c]

                if board[r][c] == 1:
                    if count < 2 or count > 3:
                        deadcells.append((r,c))
                else:
                    if count == 3:
                        livecells.append((r,c))

        for r,c in deadcells:
            board[r][c] = 0
        for r,c in livecells:
            board[r][c] = 1


