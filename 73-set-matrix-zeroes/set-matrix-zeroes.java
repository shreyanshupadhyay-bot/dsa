class Solution {
    public void setZeroes(int[][] matrix) {
        int n =  matrix.length;
        int m = matrix[0].length;
        int ro[] = new int[n];
        int co[] = new int[m];
        int c=0;
        int cn=0;
        for(int i =0;i<n;i++){
            
            for(int j =0;j<m;j++){
                if(matrix[i][j]==0){
                    ro[i]=1;
                    co[j]=1;
                    // c++;cn++;
                }
            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(ro[i]==1||co[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        
        
    }
}