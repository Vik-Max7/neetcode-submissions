class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i = 0; i < nums.length; i++){
            heap.add(nums[i]);
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = heap.remove();
        }

        return nums;
    }
}