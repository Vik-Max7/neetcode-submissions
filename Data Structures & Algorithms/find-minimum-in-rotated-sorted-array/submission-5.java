class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        //in this we are checkin based on the mid which part of the array has the dip 
        //that dip will give up the min value in rotated sorted array

        while(l < r){
            int mid = (l+r)/2;
            if(nums[mid] > nums[r]){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }

        return nums[l];
    }
}
