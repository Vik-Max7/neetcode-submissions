class Solution {
    class Pair implements Comparable<Pair> {
        int val;
        int freq;

        public Pair(int val, int freq) {
            this.val = val;
            this.freq = freq;
        }

        public int compareTo(Pair o) {
            return this.freq - o.freq;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm =
            new HashMap<>(); // key is val and val is freq of that val in an array

        int[] ans = new int[k];

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
            
            
            if (pq.size() > k) {
                pq.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().val;
        }

        return ans;
    }
}
