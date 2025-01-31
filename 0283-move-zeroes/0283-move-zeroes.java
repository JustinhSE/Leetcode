class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroPointer = 0;
        
        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroPointer] = nums[i];
                nonZeroPointer++;
            }
        }
        
        // Fill the rest with zeros
        while (nonZeroPointer < nums.length) {
            nums[nonZeroPointer] = 0;
            nonZeroPointer++;
        }
    }
}
