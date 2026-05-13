class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        int lSeq = 0;

        for (int num : hashSet) {

            if(hashSet.contains(num - 1)){
                continue;
            }

            int cSeq = 0;
            int nextElement = num;

            while (hashSet.contains(nextElement)) {
                nextElement++;
                cSeq++;
            }
            lSeq = Math.max(lSeq, cSeq);
        }

        return lSeq;
    }
}
