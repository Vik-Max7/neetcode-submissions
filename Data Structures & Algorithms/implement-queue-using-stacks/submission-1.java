class MyQueue {
    Stack<Integer> ms;

    public MyQueue() {
        ms = new Stack<>();
    }
    
    public void push(int x) {
        Stack<Integer> hs = new Stack<>();

        if(ms.isEmpty()){
            ms.push(x);
        }
        else{
        while(ms.size() > 0){
            hs.push(ms.pop());
        }

        ms.push(x);

        while(hs.size() > 0){
            ms.push(hs.pop());
        }
        }
    }
    
    public int pop() {
        return ms.pop();
    }
    
    public int peek() {
        return ms.peek();
    }
    
    public boolean empty() {
        return ms.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */