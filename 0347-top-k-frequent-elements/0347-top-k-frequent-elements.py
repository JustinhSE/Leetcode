class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = defaultdict(int)
        for item in nums:
            freq[item] += 1
        top_k = sorted(freq.items(), key=lambda x: x[1])[-k:] 
        return [key for key, value in top_k]   

        