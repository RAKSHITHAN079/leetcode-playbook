class Solution {
    public boolean checkPossibility(int[] nums) {
        int change = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (change == 1) return false; // more than one change needed
                
                if (i == 0 || nums[i - 1] <= nums[i + 1]) {
                    nums[i] = nums[i + 1]; // reduce current element
                } else {
                    nums[i + 1] = nums[i]; // increase next element
                }
                change++;
            }
        }
        return true;
    }
}
