import java.util.*;
class Solution {
    public int secondHighest(String s) {
        Set<Integer> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                set.add(Character.getNumericValue(ch));
            }
        }
        if (set.size() < 2) return -1; 
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.get(list.size() - 2); 
    }
}
