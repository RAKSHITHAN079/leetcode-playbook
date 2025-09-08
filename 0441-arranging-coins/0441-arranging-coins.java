class Solution {
    public int arrangeCoins(int n) {
        int row = 0;
        int i = 1;

        while (n >= i) {
            n -= i;   // use coins for row i
            row++;    // completed one row
            i++;      // next row needs one more coin
        }

        return row;   // number of full rows
    }
}
