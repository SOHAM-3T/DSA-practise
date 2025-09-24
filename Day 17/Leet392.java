class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s == null || s.isEmpty()) { //If string is null or empty return true
            return true;
        }
        if (s.length() > t.length()) { //If length of S > T then the subsequence will
            return false;              // never match
        }

        int sp = 0; // pointer for s
        int tp = 0; // pointer for t
        int S = s.length();
        int T = t.length();

        while (sp < S && tp < T) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }

        return sp == S;
    }
}
