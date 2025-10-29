class Solution {
    public int smallestNumber(int n) {
        for (int i = 1; i <= 31; i++) {
            int power = 1 << i; // 2^i
            if (n < power)      // changed from <= to <
                return power - 1;
        }
        return 1;
    }
}
