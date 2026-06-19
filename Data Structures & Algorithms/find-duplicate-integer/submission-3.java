class Solution {
    public int findDuplicate(int[] nums) {
        int l = 1;
        int r = nums.length - 1;

        while(l < r){
            int mid = l + (r-l)/2;

            int countLessThanMid=0;

            for(int i = 0 ; i < nums.length ; i++){
                if(nums[i] <= mid){
                    countLessThanMid++;
                }
            }

            if(countLessThanMid <= mid){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }

        return l;
    }
}
