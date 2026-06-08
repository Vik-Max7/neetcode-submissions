class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

        while(l < r){
            int mid = (l + r)/2;

            if(nums[r] < nums[mid]){
                l = mid+1;
            }
            else if(nums[r] > nums[mid]){
                r = mid;
            }
        }
        int min = l;
        System.out.println(min);

        //left side binary search
        l = 0;
        r = min;
        while(l <= r){
            int mid = (l+r)/2;
            if(target < nums[mid]){
                r = mid-1;
            }
            else if(target > nums[mid]){
                l  = mid + 1;
            }
            else {
                return mid;
            }
        }


        //right side binary search
        l = min;
        r = nums.length-1;
        while(l <= r){
            int mid = (l+r)/2;
            if(target < nums[mid]){
                r = mid-1;
            }
            else if(target > nums[mid]){
                l  = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
