class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i< operations.length; i++){
            if(operations[i].equals("+")){
                if(st.size() >= 2){
                    int num1 = st.pop();
                    int num2 = st.peek();

                    st.push(num1);
                    int sum = num1 + num2;
                    st.push(sum);
                }
                else{
                    return 0;
                }
            }
            else if(operations[i].equals("D")){
                if(st.size() >= 1){
                    int temp = st.peek();
                    st.push(2 * temp);
                }
                else {
                    return 0;
                }
            }
            else if(operations[i].equals("C")){
                if(st.size() >= 1){
                    st.pop();
                    
                }
                else{
                    return 0;
                }
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        } 

        if(st.isEmpty()){
            return 0;
        }
        
        int sum = 0;
        while(st.size() > 0){
            sum += st.pop();
        }

        return sum;
    }
}