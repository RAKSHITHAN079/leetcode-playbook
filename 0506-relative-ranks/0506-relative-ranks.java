class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] dub = score.clone();
        Arrays.sort(dub); // ascending order

        // Map scores to ranks
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = dub[n - 1 - i]; // take from highest to lowest
            String rank;
            if (i == 0) rank = "Gold Medal";
            else if (i == 1) rank = "Silver Medal";
            else if (i == 2) rank = "Bronze Medal";
            else rank = String.valueOf(i + 1); // numeric rank

            map.put(num, rank);
        }

        // Fill result
        String[] sub = new String[n];
        for (int i = 0; i < n; i++) {
            sub[i] = map.get(score[i]);
        }

        return sub;
    }
}
