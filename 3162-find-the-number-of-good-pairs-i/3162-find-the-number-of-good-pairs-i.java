class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        //initialize the variable  to count the matches and then return the value
        int a=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] % (nums2[j] * k)==0)
                a++;
            }
        }
        return a;
    }
}