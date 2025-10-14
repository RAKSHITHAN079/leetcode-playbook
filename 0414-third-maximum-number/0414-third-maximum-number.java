class Solution {
    public int thirdMax(int[] nums) {
    HashMap<Integer,Integer>m=new HashMap<>();
    for(int num:nums)m.put(num,m.getOrDefault(num,0)+1);
    ArrayList<Integer>l=new ArrayList<>();
    for(int num:m.keySet())
        l.add(num);
    Collections.sort(l);
    if (l.size() >= 3)
    return l.get(l.size() - 3);
    else return l.get(l.size() - 1);
    }
}