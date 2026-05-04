class MyHashSet {

    ArrayList<Integer> list;

    public MyHashSet() {
        list = new ArrayList<>();
    }
    
    public void add(int key) {
        if(contains(key) == false){
            list.add(key);
        }
    }
    
    public void remove(int key) {
        if(list.size() == 0){
            System.out.println("List is empty");
        }
        else{
            for(int i = list.size()-1; i>=0; i--){
                if(list.get(i) == key){
                    list.remove(i);
                }
            }
        }
    }
    
    public boolean contains(int key) {

        if(list.size() == 0){
            return false;
        }

        for(int i =0; i<list.size(); i++){
            if(list.get(i) == key){
                return true;
            }
        }

        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */