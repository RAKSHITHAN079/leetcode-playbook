class Solution {
    public int singleNonDuplicate(int[] nums) {
        // HashMap<Integer,Integer>map=new HashMap<>();
        // for(int num:nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // for(int num:nums){
        //     if(map.get(num)==1)
        //     return num;
        // }
        // return -1;

    //if the size is 1
    if(nums.length==1)return nums[0];
    // Check first element
    if (nums[0] != nums[1]) 
        return nums[0];

    // Check last element
    if (nums[nums.length - 1] != nums[nums.length - 2]) 
        return nums[nums.length - 1];

    // Check middle elements
    for (int i = 1; i < nums.length - 1; i++) {
        if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) 
            return nums[i];
    }

    return -1; // not found 
}
    }