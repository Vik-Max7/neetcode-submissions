class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

        while(l < r){
            int mid = (l + r) / 2;
            if(nums[mid] == nums[r]){
                r--;
            }
            else if(nums[mid] > nums[r]){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        int pivot = l;
        System.out.println(pivot);
        
        boolean res = binarySearch(nums,0 , l ,target);
        if(res == true){
            return true;
        }

        return binarySearch(nums,l , nums.length-1 ,target);
    }

    public boolean binarySearch(int [] nums,int l , int r ,int target){
        while (l <= r) {
            int m = (l + r) / 2;
            
             if (nums[m] == target) {
                return true;
            } else if(nums[l] == nums[r]){
                r--;
            }else if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return false;
    }
}