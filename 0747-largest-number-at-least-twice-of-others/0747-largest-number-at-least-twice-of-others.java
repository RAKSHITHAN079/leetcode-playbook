class Solution {
    public int dominantIndex(int[] nums) {
        int num[]=nums.clone();
        Arrays.sort(num);
        int fl=num[num.length-1];
        int sl=num[num.length-2];
        if(fl>=2*sl){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==fl)
                return i;
            }
        }                                        
       return -1;
    }
}