class Solution {
    public int maxProduct(int n) {
        
        String s=String.valueOf(n);
        int a[]=new int[s.length()];
        int i=0;
        while(n>0){
            int dig=n%10;
            a[i]=dig;
            i++;
            n/=10;

        }
        Arrays.sort(a);
        return a[a.length-1]*a[a.length-2];
    }
}