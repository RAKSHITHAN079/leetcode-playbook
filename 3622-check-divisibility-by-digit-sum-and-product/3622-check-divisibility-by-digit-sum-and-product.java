class Solution {
    public boolean checkDivisibility(int n) {
        int n1=n,sum=0,product=1;
        while(n1>0){
            int dig=n1%10;
            sum+=dig;
            product*=dig;
            n1/=10;
        }
        int total=sum+product;
        return n % total==0;

    }
}