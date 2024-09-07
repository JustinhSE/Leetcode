class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        int first = 0;
        int sec = 0;
        for (int num : nums) {
            int temp = first;
            first = Math.max(sec + num, first);
            sec = temp;
        }
        //1 , 3 , 5 , 7, 2 
        //tmp = 1
        //prev1 =2, 1.....
        //prev2 = 1

        return first;
    }
}