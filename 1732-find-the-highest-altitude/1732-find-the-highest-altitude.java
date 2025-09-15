class Solution {
    public int largestAltitude(int[] gain) {
        int over[]=new int[gain.length+1];
        over[0]=0;
        for(int i=0;i<gain.length;i++){
            over[i+1]=gain[i]+over[i];
        }
        Arrays.sort(over);
        return over[over.length-1];
    }
}