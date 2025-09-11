class Solution {
    public int[] sortArrayByParityII(int[] nums) {
      int oo[]=new int[nums.length];
      int even=0,odd=1;
      for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
        oo[even]=nums[i];
        even+=2;
        }
        else{
            oo[odd]=nums[i];
            odd+=2;
        }
      }
      return oo;
    
    }
}