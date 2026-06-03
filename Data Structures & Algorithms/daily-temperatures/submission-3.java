class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int res[] = new int[temperatures.length];
        st.push(temperatures.length - 1);
        res[temperatures.length - 1] = 0;

        for (int i = temperatures.length - 2; i >= 0; i--) {
            //- , a , +
            while (!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }

            if (st.size() == 0) {
                res[i] = 0;
            }

            else {
                res[i] = st.peek() - i;
            }
            st.push(i);
        }

        return res;
    }
}
