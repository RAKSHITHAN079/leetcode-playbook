class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int arr[] = new int[k];
        for(int i = 0; i < k; i++) {
            int key = -1;   
            int max = 0;   
            for(int candidate : map.keySet()) {
                if(map.get(candidate) > max) {
                    max = map.get(candidate);
                    key = candidate;
                }
            }
            arr[i] = key;       
            map.remove(key);   
        }
        return arr;
    }
}
