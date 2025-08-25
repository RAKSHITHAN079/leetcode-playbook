class Solution {
    public boolean isThree(int n) {
        int count=0,a=3;
        for(int i=1;i<=n;i++){
            if(n%i==0)count++;
            if(count>3)break;
        }
        return a==count;
    }
}