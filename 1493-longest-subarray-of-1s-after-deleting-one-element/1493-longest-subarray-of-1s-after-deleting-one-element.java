class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, zeros = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeros++;

            // More than 1 zero in the window → shrink from left
            while (zeros > 1) {
                if (nums[left] == 0) zeros--;
                left++;
            }

            // window length - 1 (since we must delete one element)
            maxLen = Math.max(maxLen, right - left);
        }
        return maxLen;
    }
}
