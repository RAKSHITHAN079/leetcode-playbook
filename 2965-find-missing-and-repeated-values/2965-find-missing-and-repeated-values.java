class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[] ans = new int[2];
        int n=grid.length;
     //insert the data into the map using put();
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[i].length;j++){            
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
     // check the repeated number using get() and missing number by usingcontainsKey()
        for (int k = 1; k <= n * n; k++) {
            if (!map.containsKey(k)) {
                ans[1] = k; 
            } 
            else if (map.get(k) == 2) {
                ans[0] = k; 
            }
        }
        return ans;     
    }
} 