class Solution:
    def similarPairs(self, words: List[str]) -> int:
        # sorting based length 
        # comparing each with the next highest double for loop nest 
        pairs = 0
        for i in range(len(words)):
            curr = set(list(words[i]))
            for j in range(i+1, len(words)):
                pairs += 1 if set(list(words[j])) == curr else 0
        return pairs

        #["aba", "bac", "aabb","abcd","aabc"]
        # ab
        