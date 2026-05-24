class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        int j = 0;
        HashSet<Integer> hs = new HashSet<>();

        while (j < nums.length) {
            if(hs.contains(nums[j])){
                return true;
            }
            hs.add(nums[j]);

            if(j - i >= k){
                hs.remove(nums[i]);
                i++;
            }
            j++;
        }

        return false;
    }
}