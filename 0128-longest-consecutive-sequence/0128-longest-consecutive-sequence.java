class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int count=0,max=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]-1){
                count++;
                max=Math.max(count,max);
            }
            else if(nums[i]==nums[i+1])
            continue;
            else
            count=0;
        }
        return max+1;
    }
}