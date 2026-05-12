class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int [] prefixArr = new int[nums.length];
        int [] suffixArr = new int[nums.length];

        prefixArr[0] = nums[0];
        suffixArr[nums.length - 1] = nums[nums.length-1];

        for(int i=1; i<nums.length; i++){
            prefixArr[i] = prefixArr[i-1] * nums[i];
            suffixArr[nums.length-i-1] = suffixArr[nums.length-i] * nums[nums.length-i-1]; 
        }

        for(int i=0; i<nums.length; i++){
            if(i == 0){
                nums[i] = suffixArr[i+1];
            }
            else if(i == nums.length-1){
                nums[i] = prefixArr[nums.length - 2];
            }
            else{
                nums[i] = prefixArr[i-1] * suffixArr[i + 1];
            }
        }
        
        return nums;
    }
}  
