class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        // boolean isIt=true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int a=map.get(s.charAt(0));
        for(int num:map.values()){
        if(num!=a)return false;

        }
        return true;
     }
}