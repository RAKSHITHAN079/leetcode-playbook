class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        return hs.size();
    }
}