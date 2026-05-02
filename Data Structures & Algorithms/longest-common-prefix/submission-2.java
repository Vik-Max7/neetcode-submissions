class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        if(strs[0].length() == 0){
            return "";
        }
        String cPre = "";
        for(int i=0; i<strs[0].length(); i++){
            String str1 = strs[0].substring(0,i+1);
            for(int j=1; j<strs.length; j++){
                String str2 = strs[j].substring(0,i+1);
                if(!str1.equals(str2)){
                    return cPre;
                }
            }
            cPre = str1;
        }

        return cPre;
    }
}