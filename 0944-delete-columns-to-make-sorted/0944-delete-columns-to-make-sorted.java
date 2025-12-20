class Solution {
    public int minDeletionSize(String[] strs) {
        int count =0;
        int a=strs.length;
        int b=strs[0].length();
        for(int i=0;i<b;i++){
            for(int j=0;j<a-1;j++){
                if(strs[j].charAt(i)>strs[j+1].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}