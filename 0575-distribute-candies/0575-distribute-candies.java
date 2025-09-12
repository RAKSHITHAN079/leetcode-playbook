class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:candyType)
        map.put(num,map.getOrDefault(num,0)+1);
        int type=map.size();
        int lim=candyType.length/2;
        if(lim<=type) return lim;
        else return type;
    
    
    }
}