class MinStack {
    Stack<Integer> st;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        int i = 0;
        int min = Integer.MAX_VALUE;
        while (i < st.size()) {
            min = Math.min(st.get(i), min);
            i++;
        }
        return min;
    }
}
