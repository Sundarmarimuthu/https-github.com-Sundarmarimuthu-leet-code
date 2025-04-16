class Solution {
    public String reversePrefix(String word, char ch) {
        char[] a=word.toCharArray();
        int l=0;
        int r=word.indexOf(ch);
        while(l<r){
            char temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
        String res="";
        for(char c:a) res+=c;
        return res;
    }
}