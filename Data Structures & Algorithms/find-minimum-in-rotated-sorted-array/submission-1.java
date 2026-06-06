class Solution {
    public int findMin(int[] nums) {
        int res = nums[0];
        int i = 0;
        while(i < nums.length-1){
            if(nums[i+1] > nums[i]){
                i++;
            }
            else{
                res = nums[i+1];
                break;
            }
        }
        return res;
    }
}
