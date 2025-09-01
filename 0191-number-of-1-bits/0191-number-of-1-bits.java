class Solution {
    public int hammingWeight(int n) {
     return Integer.bitCount(n);
    }
}
// public int hammingWeight(int n) {
//     int count = 0;
//     while (n != 0) {
//         count++;
//         n = n & (n - 1);  // remove the lowest set bit
//     }
//     return count;
// }
 