class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String b[]=s.split("\\s+");
for (int i = 0; i < k; i++) {
    if (i > 0) sb.append(" ");
    sb.append(b[i]);
}
return sb.toString();

    }
}