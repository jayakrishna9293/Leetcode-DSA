class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
          int wordIndex1 = 0, wordIndex2 = 0, p1 = 0, p2 = 0;

        while (wordIndex1 != word1.length && wordIndex2 != word2.length) {
            if (word1[wordIndex1].charAt(p1++) != word2[wordIndex2].charAt(p2++)) {
                return false;
            }
            if (p1 == word1[wordIndex1].length()) {
                p1 = 0;
                wordIndex1++;
            }
            if (p2 == word2[wordIndex2].length()) {
                p2 = 0;
                wordIndex2++;
            }
        }

        return wordIndex1 == word1.length && wordIndex2 == word2.length;
    }
}
