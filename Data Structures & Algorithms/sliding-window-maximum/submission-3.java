class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int l = 0;
        int maxIdx = 0;

        for (int r = 0; r < nums.length; r++) {
            if(nums[r] > nums[maxIdx]){
                maxIdx = r;
            }

            if (r - l + 1 == k) {
                list.add(nums[maxIdx]);
                if(maxIdx == l){
                    int i = l+1;
                    maxIdx = l+1;
                    while(i <= r){
                        if(nums[i] > nums[maxIdx]){
                            maxIdx = i;
                        }
                        i++;
                    }
                }
                l++;
            }
        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
