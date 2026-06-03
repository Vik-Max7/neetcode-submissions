class StockSpanner {
    Stack<Integer> st;

    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
         if(st.isEmpty()){
            st.push(price);
            return 1;
         }     
         else{
            int count = 1;
            for(int num : st){
                if(num <= price){
                    count++;
                }
                else{
                    count = 1; 
                }
            }
            st.push(price);
            return count;
         }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */