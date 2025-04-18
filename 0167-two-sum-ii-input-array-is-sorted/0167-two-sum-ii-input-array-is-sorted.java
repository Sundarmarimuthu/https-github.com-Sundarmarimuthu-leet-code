class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a[]=new int[2];
        int l=0;
        int r=numbers.length-1;
        for(int i=0;i<numbers.length;i++){
            if(numbers[l]+numbers[r]==target){
                a[0]=l+1;
                a[1]=r+1;
            }
            else if(numbers[l]+numbers[r]>target) r--;
            else if(numbers[l]+numbers[r]<target) l++; 

            
        }
        
            
        return a;
    }
}