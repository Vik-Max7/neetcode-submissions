class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int lowerBound = Integer.MIN_VALUE;
        int upperBound = 0;
        for(int i = 0 ; i < weights.length; i++){
            lowerBound = Math.max(lowerBound,weights[i]);
            upperBound += weights[i];
        }
       
       //Range hai lowerbound se leke upperbound tak means jo min weights hoga ship 
       //woh hoga max of the weights kykui usko bhi toh leke jana hai
       int res = upperBound;
       int totalWeight = upperBound;

       while(lowerBound <= upperBound){
        int k = (lowerBound + upperBound)/2;
        int day = 1;
        int cap = 0;
        for(int i =0; i<weights.length; i++){
            int remCap = k - cap;
            if(remCap >= weights[i]){
                cap += weights[i];
            }
            else if(remCap < weights[i]){
                day++;
                cap = weights[i];
            }
        }

        if(day <= days){
            res = Math.min(k,res);
            upperBound = k - 1;
        }
        else{
            lowerBound = k + 1;
        }
       }

       return res;
    }
}