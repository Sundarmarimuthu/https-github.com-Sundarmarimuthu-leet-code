class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int max=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char cur=s.charAt(right);
            while(set.contains(cur)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max=Math.max(max,right-left+1);
        }
        return max;
        
    }
}