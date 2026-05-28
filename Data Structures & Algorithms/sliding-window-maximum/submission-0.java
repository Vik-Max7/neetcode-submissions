class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> list = new ArrayList<>();
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            pq.add(nums[r]);
            
            if (r - l + 1 == k) {
                if (!pq.isEmpty()) {
                    list.add(pq.peek());
                }
                pq.remove(nums[l]);
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
