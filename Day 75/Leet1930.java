class Solution {
    public int countPalindromicSubsequence(String s) {
        int totalCount = 0;
        for (char character = 'a'; character <= 'z'; character++) {
            int firstIndex = s.indexOf(character);
            int lastIndex = s.lastIndexOf(character);
            int uniqueCharacterMask = 0;
            for (int currentIndex = firstIndex + 1; currentIndex < lastIndex; currentIndex++) {
                int bitPosition = s.charAt(currentIndex) - 'a';
                if ((uniqueCharacterMask >> bitPosition & 1) == 0) {
                    uniqueCharacterMask |= 1 << bitPosition;
                    totalCount++;
                }
            }
        }
      
        return totalCount;
    }
}