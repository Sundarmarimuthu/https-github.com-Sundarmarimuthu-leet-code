class Solution {
    public int reverseDegree(String s) {
        int res=0;
        int ans = 0;
        for(int i=1;i<=s.length();i++){
            res=26-(s.charAt(i-1)-'a');
            ans += i*res;
        }
        return ans;
        
    }
}