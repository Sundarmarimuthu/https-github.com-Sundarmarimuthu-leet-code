class Solution {
    public int titleToNumber(String columnTitle) {
        char[] a=columnTitle.toCharArray();
        int res=0;
        for(int i=0;i<a.length;i++){
            res=res*26+(a[i]-'A'+1);

        }
        return res;

        
    }
}