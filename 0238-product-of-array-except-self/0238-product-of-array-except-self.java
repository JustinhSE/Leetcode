class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length]; 
        // for(int i = 0; i < nums.length; i++){
        //     int num = 1;
        //     for(int j = 0; j < nums.length; j++){
        //         if(i == j){
        //             continue;
        //         }
        //         num *= nums[j];
        //     }
        //     result[i] = num;
        // }

        //sliding window
        int prev = nums[0];
        result[0] = 1;
        for(int i = 1; i < nums.length; i++){
            result[i] = prev;
            prev *= nums[i];
        }
        //1,2,3,4
        //     i
        int next= nums[nums.length-1]; 
        for(int i = nums.length-2; i >= 0; i--){
            result[i] *= next;
            next *= nums[i]; 
        }
        return result;
    }
}