class Solution {
    public int majorityElement(int[] nums) {

        int contendar = nums[0];
        int count = 1;

        for(int i=1; i<nums.length; i++){
            if(nums[i] == contendar){
                count++;
            }
            else if(count < 0){
                contendar = nums[i];
                count = 1;
            }
            else{
                count--;
            }
        }

        return contendar;
    }
}