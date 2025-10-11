class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charCount = new int[26];
        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }

        int totalLength = 0;
        for (String word : words) {
            if (canForm(word, charCount)) {
                totalLength += word.length();
            }
        }
        return totalLength;
    }

    private boolean canForm(String word, int[] charCount) {
        int[] temp = new int[26];
        for (char c : word.toCharArray()) {
            temp[c - 'a']++;
            if (temp[c - 'a'] > charCount[c - 'a']) {
                return false;
            }
        }
        return true;
    }
}
