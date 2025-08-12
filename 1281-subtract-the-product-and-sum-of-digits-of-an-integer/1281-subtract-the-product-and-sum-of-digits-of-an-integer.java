class Solution {
    public int subtractProductAndSum(int n) {
        int n1=n;
        int sum=0,product=1;
        while(n1>0){
        int dig=n1%10;
        sum+=dig;
        product*=dig;
        n1/=10;
        }
        return product-sum;
    }

}