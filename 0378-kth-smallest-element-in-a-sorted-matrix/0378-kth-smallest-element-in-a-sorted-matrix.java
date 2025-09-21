class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length*matrix[0].length;
        int arr[]=new int[n];
        int e=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[e]=matrix[i][j];
                e++;
            }
          
        }
          Arrays.sort(arr);
            return arr[k-1];
    }
}