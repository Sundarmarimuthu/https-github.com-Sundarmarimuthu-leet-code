class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        boolean[] b=new boolean[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(baskets[j]>=fruits[i] && b[j]==false){
                    b[j]=true;
                    break;
                }
            }
            
            }
            int c=0;
            for(int k=0;k<b.length;k++){
                if(b[k]==false) c++;
        }
        return c;

        
    }
}