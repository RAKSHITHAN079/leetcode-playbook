class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer>map=new HashMap<>();
        String arr1[]=s1.split("\\s+");
        for(String str:arr1)
        map.put(str,map.getOrDefault(str,0)+1);
        String arr2[]=s2.split("\\s+");
        for(String str2:arr2)
        map.put(str2,map.getOrDefault(str2,0)+1);
        ArrayList<String>list=new ArrayList<>();
        for(String str:map.keySet()){
            if(map.get(str)==1)
            list.add(str);
        }
            String[] arr = list.toArray(new String[0]);
            return arr;
        
    }
}