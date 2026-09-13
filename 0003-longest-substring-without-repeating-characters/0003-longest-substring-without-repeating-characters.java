class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int maxLen = 0;
        while (r < s.length()) {
            for (int i = l; i < r; i++) {
                if (s.charAt(i) == s.charAt(r)) {
                    l = i + 1;
                    break;
                }
            }
            int len = r - l + 1;
            maxLen = Math.max(maxLen, len);
            r++;
        }
    return maxLen;
}
}