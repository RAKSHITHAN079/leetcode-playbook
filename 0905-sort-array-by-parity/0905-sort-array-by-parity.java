class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] changed = new int[nums.length];
        int left = 0, right = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                changed[left++] = num;  
            } else {
                changed[right--] = num;
            }
        }

        return changed;
    }
}
