class Solution {
    public int diagonalSum(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int p=0,s=0,t=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    p+=mat[i][j];
                }
                else if(i+j==c-1){
                    s+=mat[i][j];
                }
            }
        }
        t=p+s;
        return t;
    }
}