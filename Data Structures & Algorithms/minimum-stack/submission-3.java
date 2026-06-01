class MinStack {
    Stack<Integer> st;
    Stack<Integer> mSt;

    public MinStack() {
        st = new Stack<>();
        mSt = new Stack<>();
    }

    public void push(int val) {
        st.push(val);

        if (mSt.size() == 0) {
            mSt.push(val);
        } else {
            if(val <= mSt.peek()){
                mSt.push(val);
            }
        }
    }

    public void pop() {
        int val = st.pop();

        if(mSt.peek() == val){
            mSt.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return mSt.peek();
    }
}
