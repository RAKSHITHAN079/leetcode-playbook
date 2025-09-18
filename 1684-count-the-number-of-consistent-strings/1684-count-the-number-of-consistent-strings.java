class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int count=0;
        for(String str:words){
            boolean flag=true;
            for(int i=0;i<str.length();i++){
                if(allowed.indexOf(str.charAt(i))==-1)
                
                 flag=false;
            }
            if(flag)count++;
        }
        return count;
    }
}