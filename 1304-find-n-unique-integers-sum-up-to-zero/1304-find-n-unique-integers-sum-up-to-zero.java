class Solution {
    public int[] sumZero(int n) {
        int[] a = new int[n];
        int v = 1;
        int left = 0, right = n - 1;
        while (left < right) {
            a[left] = v;
            a[right] = -v;
            v++;
            left++;
            right--;
        }
  return a;
    }
}
