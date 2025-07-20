class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        left_products = [0] * n
        right_products = [0] * n
        final_answer = [0] * n

        temp = 1
        for i in range(n):
            left_products[i] = temp  
            temp *= nums[i]          

        temp = 1  
        for j in range(n - 1, -1, -1): 
            right_products[j] = temp 
            temp *= nums[j]         

        
        for i in range(n):
            final_answer[i] = left_products[i] * right_products[i] 

        return final_answer

            