class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (int i=0; i<sentences.length; i++) {
            String sentence = sentences[i];
            int nows = sentence.split(" ").length;
            maxWords = nows > maxWords ? nows : maxWords;
        }
        return maxWords;
    }
}