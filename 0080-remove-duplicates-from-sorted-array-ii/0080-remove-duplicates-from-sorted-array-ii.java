class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;       // index to place the next valid element
        int count = 1;   // count occurrences of current number
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1; // reset for new number
            }
            
            if (count <= 2) {   // allow at most 2 duplicates
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
    }
}
