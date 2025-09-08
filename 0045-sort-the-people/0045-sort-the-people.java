class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // TreeMap sorts keys (heights) in ascending order by default
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        int n = names.length;
        
        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]); // key = height, value = name
        }

        // Extract sorted names
        return map.values().toArray(new String[0]);
    }
}