class MyStack {
    Queue<Integer> mq;

    public MyStack() {
        mq = new LinkedList<>();
    }
    
    public void push(int x) {
        if(mq.isEmpty()){
            mq.add(x);
        }
        else{
            Queue<Integer> hq = new LinkedList<>();
            while(mq.size() > 0){
                hq.add(mq.remove());
            }
            mq.add(x);

            mq.addAll(hq);
        }
    }
    
    public int pop() {
        return mq.remove();
    }
    
    public int top() {
        return mq.peek();
    }
    
    public boolean empty() {
        return mq.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */