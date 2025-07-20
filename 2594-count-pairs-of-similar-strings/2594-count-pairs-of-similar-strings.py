class Solution:
    def similarPairs(self, words: List[str]) -> int:
        #sorting based length 
        # comparing each with the next highest double for loop nest 
        strings = sorted(words, key = len)
        pairs = 0
        for i in range(len(strings)):
            curr = set(list(strings[i]))
            for j in range(i+1, len(strings)):
                pairs += 1 if set(list(strings[j])) == curr else 0
        return pairs

        #["aba", "bac", "aabb","abcd","aabc"]
        # ab
        