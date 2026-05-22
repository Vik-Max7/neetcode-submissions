class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        int l = nums.length - k;
        int r = nums.length - 1;

        while(l < r){
            swap(nums, l, r);
            l++;
            r--;
        }

        l = 0;
        r = nums.length - k - 1;

        while(l < r){
            swap(nums, l, r);
            l++;
            r--;
        }

        l = 0;
        r = nums.length - 1;

        while(l < r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    public void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}