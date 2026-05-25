class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }
        int maxSubCount = 0;
        int l = 0;
        int r = 0;
        Set<Character> set = new HashSet<>();
        while(r < s.length()){
            if(!set.contains(s.charAt(r))){
               maxSubCount = Math.max(maxSubCount, r - l + 1);
                set.add(s.charAt(r));
                r++;
            }
            else{
                set.remove(s.charAt(l));
                l++;
            }
        }

        return maxSubCount;
    }
}
