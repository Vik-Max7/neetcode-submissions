class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();

        int l = 0;
        int mCount = 0;

        for (int r = 0; r < s.length(); r++) {
            char curr = s.charAt(r);

            hm.put(curr, hm.getOrDefault(curr, 0) + 1);

            int maxFreq = 0;

            for (int val : hm.values()) {
                maxFreq = Math.max(maxFreq, val);
            }

            int replacement = (r - l + 1) - maxFreq;

            while (replacement > k) {
                char leftChar = s.charAt(l);

                hm.put(leftChar, hm.get(leftChar) - 1);

                if (hm.get(leftChar) == 0) {
                    hm.remove(leftChar);
                }

                l++;

                // Recalculate maxFreq after shrinking
                maxFreq = 0;
                for (int val : hm.values()) {
                    maxFreq = Math.max(maxFreq, val);
                }

                replacement = (r - l + 1) - maxFreq;
            }

            mCount = Math.max(mCount, r - l + 1);
        }

        return mCount;
    }
}