class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String word1String = String.join("", word1);
        String word2String = String.join("", word2);
        return word1String.equals(word2String);
    }
}