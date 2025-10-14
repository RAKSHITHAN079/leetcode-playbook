class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> m= new HashMap<>();
        for(int num:nums)m.put(num,m.getOrDefault(num,0)+1);
        for(int num:m.keySet()){
            if(isprime(m.get(num)))
            return true;
        }
        return false ;
    }

         boolean isprime(int x){
            if(x<=1)return false;
            for(int i=2;i*i<=x;i++){
                if(x%i==0)return false;
            }
            return true;
        }
}