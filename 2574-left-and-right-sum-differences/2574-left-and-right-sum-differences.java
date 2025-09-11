// class Solution {
//     public int[] leftRightDifference(int[] nums) {
//         int ls=0,rs=0;
//         int res[]=new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             if(i==0) ls=0;
//             else
//             ls+=nums[i-1];
//             rs=0;
//             for(int j=i+1;j<nums.length;j++){        
//                     rs+=nums[j];
//             }
//             res[i]=Math.abs(ls-rs);
//         }
//         return res;
//     }
// }

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int []res=new int[n];
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<n;i++){
            rightsum+=nums[i];
        }
        for(int i=0;i<n;i++){
            rightsum-=nums[i]; //remove current elem from rigthsum
            res[i]=Math.abs(rightsum-leftsum); //store the difference
            leftsum+=nums[i]; //include crr elem in leftsum
        }
        return res;
    }
}