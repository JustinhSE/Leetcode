class Solution {
    public int minimumOperations(int[] nums) {
        if(nums.length == 1){
            return nums[0] <=  0? 0 : 1;
        }
        int t = 0;
        while(!Arrays.stream(nums).allMatch(num -> num == 0)){
            int x = findX(nums);
            for(int i = 0; i < nums.length; i++ )
            {
                nums[i] = nums[i]== 0 ? nums[i] : nums[i] - x;
            }
            t++;
        }
        return t;
    }
    public int findX(int[] nums){
        int x = Integer.MAX_VALUE;
        for(int n : nums){
            x = n < x && n > 0 ? n : x;
        }
        return x;
    }
}