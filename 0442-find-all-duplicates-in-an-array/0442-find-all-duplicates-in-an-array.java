class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)>1)
            list.add(num);
        }
        return list;
    }
}