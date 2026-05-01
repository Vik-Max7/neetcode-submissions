class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String st : strs){  
            sb.append(st.length()).append("#").append(st);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        System.out.println(str);
        List<String> st = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i = j+1;
            j = length+i;
            st.add(str.substring(i,j));
            i=j;
        }
        return st;
    }
}
