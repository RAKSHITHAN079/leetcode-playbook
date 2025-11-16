class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int num[]=new int[nums.length];
        int k=0;
        for(int i=1;i<nums.length;i+=2){
            num[k++]=nums[i];
            num[k++]=nums[i-1];
        }
        return num;
    }
}