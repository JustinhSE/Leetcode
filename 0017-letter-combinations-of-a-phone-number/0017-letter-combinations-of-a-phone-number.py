class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if not digits:
            return []
        numbers = ["2","3","4","5","6","7","8","9"]
        letters = [
            ["a", "b", "c"],
            ["d", "e", "f"],
            ["g", "h", "i"],
            ["j", "k", "l"],
            ["m", "n", "o"],
            ["p", "q", "r", "s"],
            ["t", "u", "v"],
            ["w", "x", "y", "z"]
        ]
        mapp = dict(zip(numbers, letters))
        res = []
        
        def backtrack(index, path):
            if index == len(digits):
                res.append("".join(path))
                return
            for letter in mapp[digits[index]]:
                path.append(letter)
                backtrack(index + 1, path)
                path.pop()
        
        backtrack(0, [])
        return res


            