class Solution {
    public int[] frequencySort(int[] nums) {
        // Step 1: Count frequencies
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        // Step 2: Convert to Integer[] for sorting with comparator
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        // Step 3: Custom sorting
        Arrays.sort(arr, (a, b) -> {
            int fa = freq.get(a), fb = freq.get(b);
            if (fa != fb) return fa - fb;   // smaller frequency first
            return b - a;                   // if same frequency → larger number first
        });
        // Step 4: Convert back to int[]
        return Arrays.stream(arr).mapToInt(i -> i).toArray();
    }
}
