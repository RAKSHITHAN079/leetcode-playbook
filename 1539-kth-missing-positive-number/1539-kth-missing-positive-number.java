class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] miss = new int[k]; 
        int start = 0;           
        int idx = 0;             
        // scan numbers until we find k missing ones
        for (int i = 1; start < k; i++) {
            if (idx < arr.length && arr[idx] == i) {
                // if number exists in arr, move forward in arr
                idx++;
            } else {
                // number is missing
                miss[start++] = i;
            }
        }
        return miss[k - 1]; // kth missing
    }
}
