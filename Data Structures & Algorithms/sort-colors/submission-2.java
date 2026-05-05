class Solution {
    public void sortColors(int[] nums) {
        int i = 0; // this will scan the entire array
        int j = 0; // Boundary for 0's and 1's in an array 
        int k = nums.length-1; // Boundary for 1's and 2'2 in an array

        //This Algo is to mantain regions for 0's 1's and 2's
        //i --> k unknows areas
        //0 --> j-1 0's area
        //j --> k-1 1's area
        //k --> i-1 2's area

        while(i <= k){
            if(nums[i] == 0){
                swap(nums,i , j);
                j++;
                i++;
            }
            else if(nums[i] == 2){
                swap(nums,i,k);
                k--;
            }
            else{
                i++;
            }
        }
    }

    public static void swap(int [] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}