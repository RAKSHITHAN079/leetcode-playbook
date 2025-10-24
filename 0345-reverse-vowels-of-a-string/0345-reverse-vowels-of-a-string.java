class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        // Step 1: Collect vowels
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                list.add(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        // Step 2: Replace vowels in reverse order
        int idx = list.size() - 1; // pointer to last vowel
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                sb.append(list.get(idx--)); // append and move pointer
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
