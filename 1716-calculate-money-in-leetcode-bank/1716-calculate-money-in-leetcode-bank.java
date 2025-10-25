class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int weekStart = 1; 
        for (int i = 0; i < n; i++) {
            sum += weekStart + (i % 7); 
            if ((i + 1) % 7 == 0) {
                weekStart++;
            }
        }
        return sum;
    }
}
