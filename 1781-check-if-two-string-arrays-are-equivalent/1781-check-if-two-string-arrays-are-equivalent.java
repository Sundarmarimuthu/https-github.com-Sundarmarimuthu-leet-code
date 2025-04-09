class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w="";
        String e="";
        for(int i=0;i<word1.length;i++){
            w+=word1[i];
        }
        for(int i=0;i<word2.length;i++){
            e+=word2[i];
        }
        if(w.equals(e)) return true;
        else return false;
        
    }
}