class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                prod *= num;
            }
        }

        if (zeroCount > 1) {
            return new int[nums.length];
        }

        for(int i=0; i<nums.length; i++){
            if(zeroCount == 1){
                if(nums[i] == 0){
                    nums[i] = prod;
                }
                else{
                    nums[i] = 0;
                }
            }
            else {
                nums[i] = prod / nums[i];
            }
        }

        return nums;
    }
}
