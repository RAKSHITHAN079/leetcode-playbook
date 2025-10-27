class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums)
        set.add(num);
        for(int i=0;i<set.size();i++){
        if(set.contains(original)) original*=2;
        else return original;
        }
        return original;
    }
}