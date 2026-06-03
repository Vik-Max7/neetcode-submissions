class Solution {
    class Pair{
        int temp;
        int idx;

        public Pair(int temp, int idx){
            this.temp = temp;
            this.idx = idx;
        }
    }

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> st = new Stack<>();
        int res[] = new int[temperatures.length];

        for(int i = 0; i<temperatures.length; i++){
            if(!st.isEmpty() && st.peek().temp < temperatures[i]){
                while(!st.isEmpty() && st.peek().temp < temperatures[i]){
                    Pair p = st.pop();
                    res[p.idx] = i - p.idx;
                }
                st.push(new Pair(temperatures[i],i));
            }
            else{
                Pair np = new Pair(temperatures[i] , i);
                st.push(np);
            }
        }

        while(st.size() > 0){
            Pair p = st.pop();
            res[p.idx] = 0;
        }

        return res;
    }
}
