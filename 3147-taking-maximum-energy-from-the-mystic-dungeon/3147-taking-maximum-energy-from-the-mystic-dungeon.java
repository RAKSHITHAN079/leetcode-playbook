class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int maxEnergy = Integer.MIN_VALUE;
        // Process each group (based on modulo)
        for (int start = n - 1; start >= n - k; start--) {
            int current = 0;
            for (int i = start; i >= 0; i -= k) {
                current += energy[i];
                maxEnergy = Math.max(maxEnergy, current);
            }
        }
        return maxEnergy;
    }
}
