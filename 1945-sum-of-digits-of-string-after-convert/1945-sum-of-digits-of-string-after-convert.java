class Solution {
    public int getLucky(String s, int k) {
        int n = s.length();
        int  sum = 0;
        for(char ch: s.toCharArray()){
            int val = (ch-'a')+1;
           while(val > 0){
                sum += val % 10;
                val /= 10;
            }
        }

        int i =1;
        while(i<k){
           int temp = 0;
            while(sum>0){
                int  digit = sum%10;
                sum = sum/10;
               temp = temp+digit;
            }
            sum = temp;
            i++;
        }
        return sum;    
        
    }
}