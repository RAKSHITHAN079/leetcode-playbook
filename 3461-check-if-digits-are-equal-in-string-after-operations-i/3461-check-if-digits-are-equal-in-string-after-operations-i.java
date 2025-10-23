public class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        // Convert to an array of digits 
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = s.charAt(i) - '0';
        }
        // Repeatedly reduce until length == 2
        while (digits.length > 2) {
            int newLen = digits.length - 1;
            int[] next = new int[newLen];
            for (int i = 0; i < newLen; i++) {
                next[i] = (digits[i] + digits[i+1]) % 10;
            }
        // Assign the updaated digits to a digit array
            digits = next;
        }
        // Now 2 will be the length of an array
                return digits[0] == digits[1];
    }
}
