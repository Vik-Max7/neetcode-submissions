class Solution {
    public int maxArea(int[] heights) {
        int maxWaterCap = Integer.MIN_VALUE;
        int l = 0;
        int r = heights.length-1;

        while(l < r){
            int currWaterCap = (r - l) * Math.min(heights[l], heights[r]);
            maxWaterCap = Math.max(currWaterCap,maxWaterCap);
            if(heights[l] < heights[r]){
                l++;
            }
            else{
                r--;
            }
        }

        return maxWaterCap;
    }
}