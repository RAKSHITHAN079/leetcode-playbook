import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Normalize: lowercase and replace punctuation with space
        paragraph = paragraph.toLowerCase().replaceAll("[!?',;.]", " ");

        // Split by spaces
        String[] words = paragraph.split("\\s+");

        // Store banned words in a Set for fast lookup
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        // Count frequencies
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!bannedSet.contains(word) && word.length() > 0) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        // Find most frequent
        String result = "";
        int max = 0;
        for (String word : map.keySet()) {
            if (map.get(word) > max) {
                max = map.get(word);
                result = word;
            }
        }

        return result;
    }
}
