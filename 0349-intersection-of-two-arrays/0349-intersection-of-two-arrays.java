class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Use a set to store unique elements from nums1
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        // Another set to store intersection
        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        // Convert set to array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}
