class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix[0].length * matrix.length-1; //col * row  *1

        // 3,2 - row 3, 2 
        // (row * nums of col ) + col 
        int r = 0, c = 0;
        while (start <= end) {
            int mid = start + (end-start)/2;
            c = mid % matrix[0].length; 
            r = mid / matrix[0].length;
            if (matrix[r][c] == target) return true;
            else if (matrix[r][c] > target) end = mid-1; //need to decrement for while
            else start = mid+1; //need to increment for while
        }

        return matrix[r][c] == target ? true : false;
    }
}