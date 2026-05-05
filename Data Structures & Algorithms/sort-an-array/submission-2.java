class Solution {
    public int[] sortArray(int[] nums) {
        
        //starting the iter from idx 1 because in insertion sort we assume 1 element in sorted by itself
        for(int i=1; i<nums.length; i++){
            for(int j=i-1; j>=0; j--){
                if(nums[j] < nums[j+1]){
                    break;
                }
                else{
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        return nums;
    }
}