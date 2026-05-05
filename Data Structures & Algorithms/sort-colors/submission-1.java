class Solution {
    public void sortColors(int[] nums) {
        int i = 0; //pointer for 0
        int j = nums.length-1; //pointer for 2

        int k = 0;
        while (k <= j){
            if(nums[k] == 0){
                swap(nums,i,k);
                i++;
                k++;
            }
            else if(nums[k] == 2){
                swap(nums,j,k);
                j--;
            }
            else {
                k++;
            }
        }
    }

    public static void swap(int [] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}