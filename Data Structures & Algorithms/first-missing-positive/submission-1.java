class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                set.add(nums[i]);
            }
            max = Math.max(max, nums[i]);
        }

        if (max <= 0) {
            return 1;
        }

        System.out.println(max);

        for (int i = 1; i <= max; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return max+1;
    }
}