class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // Sort by units per box in descending order
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int load = 0;
        for (int[] box : boxTypes) {
            if (truckSize == 0) break;  // Stop if the truck is full
            int boxes = Math.min(box[0], truckSize); // Take as many as we can
            load += boxes * box[1];     // Add total units
            truckSize -= boxes;         // Reduce remaining capacity
        }
        return load;
    }
}
