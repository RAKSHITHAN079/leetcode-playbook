class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
         int max=0;
        for(int num:map.keySet()){  
            if(map.get(num)>max){
            max=map.get(num);
            }
        }
        for(int num:map.keySet()){
        if(map.get(num)==max)
        return num;
        }
        return 1;
    }
}