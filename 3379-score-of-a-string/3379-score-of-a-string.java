class Solution {
    public int scoreOfString(String s) {
        char[]a=s.toCharArray();
        int sum=0;
        for(int i=1;i<a.length;i++){
            sum+=Math.abs((int)a[i-1]-(int)a[i]);

        }
        return sum;
        
    }
}