class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        int l = 0;
        int idx = 0;
        int maxIdx = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] > nums[maxIdx]) {
                maxIdx = r;
            }

            if (r - l + 1 == k) {
                ans[idx] = nums[maxIdx];
                idx++;
                if (maxIdx == l) {
                    int i = l + 1;
                    maxIdx = l + 1;
                    while (i <= r) {
                        if (nums[i] > nums[maxIdx]) {
                            maxIdx = i;
                        }
                        i++;
                    }
                }
                l++;
            }
        }

        return ans;
    }
}
