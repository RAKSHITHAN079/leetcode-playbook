class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // convert arrays to sets
        Set<Integer> set1 = new HashSet<>();
        for (int x : nums1) {
            set1.add(x);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int x : nums2) {
            set2.add(x);
        }
        // prepare result lists
        List<Integer> onlyInNums1 = new ArrayList<>();
        List<Integer> onlyInNums2 = new ArrayList<>();
        // elements in set1 not in set2
        for (int x : set1) {
            if (!set2.contains(x)) {
                onlyInNums1.add(x);
            }
        }
        // elements in set2 not in set1
        for (int x : set2) {
            if (!set1.contains(x)) {
                onlyInNums2.add(x);
            }
        }
        // build final answer
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(onlyInNums1);
        answer.add(onlyInNums2);
        return answer;
    }
}
