class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[n+m];
        int p = 0, q = 0, i= 0;
        while(p < m || q < n){
            if(p == m){
                arr[i] = nums2[q];
                q++;
            }
            else if (q == n){
                arr[i] = nums1[p];
                p++;
            }
            else{
                if(nums1[p] < nums2[q]){
                    arr[i] = nums1[p];
                    p++;
                }
                else{
                    arr[i] = nums2[q];
                    q++;
                }
            }
            i++;
        }
        System.arraycopy(arr,0,nums1,0, n+m);
    }
}