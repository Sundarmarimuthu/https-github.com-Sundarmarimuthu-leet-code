class Solution {
    public int smallestEvenMultiple(int n) {
        int i=1;
        while(i%2!=0 || i%n!=0){

            i++;
        }
        return i;
    }
}