class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> res = new ArrayList<>();
        boolean[] used = new boolean[arr.length];

        for (int i = 0; i < k; i++) {

            int bestIdx = -1;

            for (int j = 0; j < arr.length; j++) {

                if (used[j]) {
                    continue;
                }

                if (bestIdx == -1) {
                    bestIdx = j;
                } else {

                    int currDiff = Math.abs(arr[j] - x);
                    int bestDiff = Math.abs(arr[bestIdx] - x);

                    if (currDiff < bestDiff) {
                        bestIdx = j;
                    } 
                    else if (currDiff == bestDiff &&
                             arr[j] < arr[bestIdx]) {
                        bestIdx = j;
                    }
                }
            }

            used[bestIdx] = true;
            res.add(arr[bestIdx]);
        }

        Collections.sort(res);

        return res;
    }
}