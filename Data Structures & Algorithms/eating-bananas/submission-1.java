class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxKokoSpeed = Integer.MIN_VALUE;

        for(int i=0; i< piles.length; i++){
            maxKokoSpeed = Math.max(piles[i] , maxKokoSpeed);
        }

        int l = 1;
        int r = maxKokoSpeed;
        int res = maxKokoSpeed;

        while(l <= r){
            int mid = (l + r) / 2;
            int time = 0;
            int i= 0;
            while(i < piles.length){
                time += Math.ceil((double)piles[i]/mid);
                i++;
            } 
            System.out.println(time);
            if(time <= h){
                res = Math.min(mid,res);
                r = mid - 1;
            }
            else if(time > h){
                l = mid+1;
            }
        }

        return res;
    }
}
