class Solution {
    public String longestPalindrome(String s) {
        String ls="";
        for(int i=0;i<s.length();i++){
            String odd=order(s,i,i);
            if(ls.length()<odd.length()) ls=odd;
            String even=order(s,i,i+1);
            if(ls.length()<even.length()) ls=even;
        }
       return ls; 
    }
    public static String order(String s,int left,int right){
        while(left>=0 && right<=s.length()-1 && s.charAt(left)==s.charAt(right)){
        left--;
        right++;
        }
        return s.substring(left+1,right);
    }
}