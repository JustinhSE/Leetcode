class Solution:
    def findXSum(self, nums: List[int], k: int, x: int) -> List[int]:
        #nums = [1,1,2,2,3,4,2,3], k = 6, x = 2
        # i = [0,2],s = lst of it        
        result = []
        for i in range(0,len(nums) - k+1):
            lst = nums[i:i+k]
            s = set(lst)
            if len(s) < x:
                result.append(sum(lst))
                continue
            map = defaultdict(int)
            for n in lst:
                map[n] += 1
            top_x = sorted(map.items(), key = lambda x: (x[1], x[0]), reverse = True)[:x]
            keys = [k for k, v in top_x]
            answer = filter(lambda k: k in keys, lst)
            result.append(sum(answer))
        return result




