class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums)
        map.put(num,map.getOrDefault(num,0)+1);
        for(int num:map.keySet()){
            if(map.get(num)==n)
            return num;
        }
        return -1;
    }
}