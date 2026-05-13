class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        int lSeq = 0;

        for (int i = 0; i < nums.length; i++) {

            if(hashSet.contains(nums[i] - 1)){
                continue;
            }

            int cSeq = 0;
            int nextElement = nums[i];

            while (hashSet.contains(nextElement)) {
                nextElement++;
                cSeq++;
            }
            if (cSeq > lSeq) {
                lSeq = cSeq;
            }
        }

        return lSeq;
    }
}
