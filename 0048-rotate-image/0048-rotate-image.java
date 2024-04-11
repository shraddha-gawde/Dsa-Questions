class Solution {
    public void rotate(int[][] matrix) {
        int res[][]=new int[matrix.length][matrix[0].length];
        int k=matrix.length-1;
        for(int[] i:matrix){
            for(int j=0;j<matrix[0].length;j++){
                res[j][k]=i[j];
            }
            k--;
        }
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res.length;j++){
                matrix[i][j]=res[i][j];
            }
        }
    }
}