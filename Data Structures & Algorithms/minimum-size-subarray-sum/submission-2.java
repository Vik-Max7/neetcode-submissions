class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int minSubArrayCount = Integer.MAX_VALUE;

        while (r < nums.length) {
            if (sum < target) {
                sum += nums[r];
                r++;
            } while (sum >= target && l < r) {
                minSubArrayCount = Math.min(r - l, minSubArrayCount);
                System.out.println(minSubArrayCount);
                sum -= nums[l];
                l++;
            }
        }

        return minSubArrayCount == Integer.MAX_VALUE ? 0 : minSubArrayCount;
    }
}