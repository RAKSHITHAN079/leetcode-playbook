class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
          if(nums[i]>9){
            int t=nums[i];
            int dig=0;
            while(t>0){
                 dig+=t%10;
                 t/=10;
            }
            nums[i]=dig;
          }
        }
        Arrays.sort(nums);
        return nums[0];
    }
}