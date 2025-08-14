// LeetCode 263: Ugly Number
// Author: Rakshi
// Date: 2025-08-14
// Description: Check if a given number is an Ugly Number (only prime factors 2, 3, or 5).

import java.util.HashMap;

class Solution {
    /**
     * Determines if the given integer is an ugly number.
     * Ugly numbers are positive numbers whose prime factors are limited to 2, 3, and 5.
     * 
     * @param n the integer to check
     * @return true if n is an ugly number, false otherwise
     */
    public boolean isUgly(int n) {
        if (n <= 0) return false; // Ugly numbers must be positive
        
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }    
}
    