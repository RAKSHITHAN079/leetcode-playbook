class Solution {
    public int[] constructRectangle(int area) {
        int[] a = new int[2];

        // Start from sqrt(area) and go downwards
        for (int w = (int)Math.sqrt(area); w > 0; w--) {
            if (area % w == 0) {
                int l = area / w;
                a[0] = l;
                a[1] = w;
                return a;  // first valid pair is the best
            }
        }
        return a;
    }
}
