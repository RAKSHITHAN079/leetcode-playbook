class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;        // count how many 5s contribute
            count += n;
        }
        return count;
    }
}
