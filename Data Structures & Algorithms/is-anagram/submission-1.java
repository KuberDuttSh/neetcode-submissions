class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] b = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            ++b[s.charAt(i) - 'a'];
            --b[t.charAt(i) - 'a'];
        }
        for (int i = 0; i < 26; ++i) {
            if (b[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
