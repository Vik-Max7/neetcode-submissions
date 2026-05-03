class Solution {
    public int removeElement(int[] nums, int val) {

        if(nums.length == 0){
            return 0;
        }

        int[] ans = new int [nums.length];

        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                ans[k] = nums[i];
                k++;
            }
        }

        for(int i=0; i<k; i++){
            nums[i] = ans[i];
        }
        
        return k;
    }
}