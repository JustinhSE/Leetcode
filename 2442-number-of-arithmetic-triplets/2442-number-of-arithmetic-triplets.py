class Solution:
    def arithmeticTriplets(self, nums: List[int], diff: int) -> int:
        triplets = 0
        for i in range(0,len(nums)-2):
            for j in range(i+1, len(nums)-1):
                for k in range(j+1, len(nums)):
                    if (nums[j] - nums[i] == diff) and (nums[k] - nums[j] == diff):
                        triplets+=1

        return triplets

        '''
        [4,5,6,7,8,9], diff = 2
         i,j,      k
        '''