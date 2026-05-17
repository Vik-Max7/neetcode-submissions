class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            char ch1 = Character.toLowerCase(s.charAt(i));
            char ch2 = Character.toLowerCase(s.charAt(j));

            if ((ch1 < 'a' || ch1 > 'z') && (ch1 < '0' || ch1 > '9')) {
                i++;
            }

            else if ((ch2 < 'a' || ch2 > 'z') && (ch2 < '0' || ch2 > '9')) {
                j--;
            }

            else if (ch1 != ch2) {
                System.out.println(ch1 + "__>" + ch2);
                return false;
            }

            else {
                i++;
                j--;
            }
        }
        return true;
    }
}
