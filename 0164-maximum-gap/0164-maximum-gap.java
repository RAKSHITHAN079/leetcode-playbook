class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        if(nums.length<2)return 0;
        for(int i=0;i<nums.length-1;i++){
        int diff=nums[i+1]-nums[i];
         max=Math.max(diff,max);
    }
    return max;
}
}