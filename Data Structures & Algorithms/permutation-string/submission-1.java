class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0)+1);
        }
        System.out.println("Map1"
            + ".  " + map1);
        int l = 0;
        int r = 0;
        int k = s1.length();
       HashMap<Character, Integer> map2 = new HashMap<>();

        while (r < s2.length()) {
            map2.put(s2.charAt(r), map2.getOrDefault(s2.charAt(r), 0)+1);
            System.out.println("Map2"
                + ".  " + map2);
            if (r - l + 1 < k) {
                r++;
            } else if (r - l + 1 == k) {
                if (map1.equals(map2)) {
                    return true;
                } else {
                    char ch = s2.charAt(l);

                    if (map2.containsKey(ch)) {
                        map2.put(ch, map2.get(ch) - 1);
                        if (map2.get(ch) <= 0) {
                            map2.remove(ch);
                        }
                    }
                }
                l++;
                r++;
            }
        }

        return false;
    }
}
