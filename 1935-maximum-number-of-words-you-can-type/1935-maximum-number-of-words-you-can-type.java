class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] str = text.split("\\s+");
        int count=0;
       
        for(String s:str){
             boolean flag=true;
            for(int i=0;i<s.length();i++){
                if(brokenLetters.indexOf(s.charAt(i))!=-1)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)count++;
        }
           return count;
    }
}