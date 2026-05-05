class Solution {
    public int[] sortArray(int[] nums) {
        return MergeSort(nums, 0, nums.length - 1);
    }

    public static int[] MergeSort(int nums[], int lo, int hi) {
        if (lo == hi) {
            int[] ba = new int[1];
            ba[0] = nums[lo];
            return ba;
        }

        int mid = (lo + hi) / 2;
        int[] fsh = MergeSort(nums, lo, mid);
        int[] ssh = MergeSort(nums, mid + 1, hi);

        int[] fsa = mergeTwoSorted(fsh, ssh);
        return fsa;
    }

    public static int[] mergeTwoSorted(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int idx = 0;
        int ans[] = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                ans[idx] = nums1[i];
                i++;
            } else {
                ans[idx] = nums2[j];
                j++;
            }
            idx++;
        }

        while (i < nums1.length) {
            ans[idx] = nums1[i];
            idx++;
            i++;
        }

        while (j < nums2.length) {
            ans[idx] = nums2[j];
            idx++;
            j++;
        }

        return ans;
    }
}