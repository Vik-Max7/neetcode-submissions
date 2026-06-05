class FreqStack {
    Stack<Integer> st;
    HashMap<Integer,Integer> hm;

    public FreqStack() {
        st = new Stack<>();
        hm = new HashMap<>();
    }
    
    public void push(int val) {
        st.push(val);
        hm.put(val,hm.getOrDefault(val,0) + 1);
    }
    
    public int pop() {
        int freq = 0;
        for(int num : hm.values()){
           freq = Math.max(freq,num); 
        }

        Stack<Integer> hs = new Stack<>();

        while(hm.get(st.peek()) != freq){
            hs.push(st.pop());
        }

        int val = st.pop();
        hm.put(val,hm.get(val) - 1);

        while(!hs.isEmpty()){
            st.push(hs.pop());
        }

        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */