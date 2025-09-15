class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int max = -1;  // last element should be -1

        for (int i = n - 1; i >= 0; i--) {
            result[i] = max;   // assign current greatest
            max = Math.max(max, arr[i]); // update greatest so far
        }

        return result;
    }
}
