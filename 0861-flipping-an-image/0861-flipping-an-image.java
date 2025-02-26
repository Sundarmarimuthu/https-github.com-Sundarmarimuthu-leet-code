class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r=image.length;
        int c=image[0].length;
        //int ind=image[a]
        int re[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(image[i][j]==0)  re[i][j]=1;
                else re[i][j]=0;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c/2;j++){
                int temp=re[i][j];
                re[i][j]=re[i][c-j-1];
                re[i][c-j-1]=temp;
            }
        }
        return re;
        
    }
}