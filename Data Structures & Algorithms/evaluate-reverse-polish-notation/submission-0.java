class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < tokens.length; i++){
            String curr = tokens[i];
            if(!st.isEmpty() && (curr.equals("+") || curr.equals("-") || curr.equals("*") || curr.equals("/"))){
                int num1 = st.pop();
                int num2 = st.pop();
                int ans;
                if(curr.equals("+")){
                    ans = num2 + num1;
                }
                else if(curr.equals("-")){
                    ans = num2 - num1;
                }
                else if(curr.equals("*")){
                    ans = num2 * num1;
                }
                else{
                    ans = num2 / num1;
                }
                st.push(ans);
            }
            else{
                st.push(Integer.parseInt(curr));
            }
        }

        return st.pop();
    }
}
