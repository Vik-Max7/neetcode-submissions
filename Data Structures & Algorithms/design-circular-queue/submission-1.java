class MyCircularQueue {

    LinkedList<Integer> list;
    int size;

    public MyCircularQueue(int k) {
        list = new LinkedList<>();
        size = k;
    }
    
    public boolean enQueue(int value) {
        if(list.size() < size){
            list.addLast(value);
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(list.size() < 1){
            return false;
        }

        list.removeFirst();
        return true;
    }
    
    public int Front() {
        return list.peekFirst() == null ? -1 : list.peekFirst();
    }
    
    public int Rear() {
        return list.peekLast()== null ? -1 : list.peekLast();
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public boolean isFull() {
        return list.size() == size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */