class Solution {
    public int[] productExceptSelf(int[] nums) {
        int j=1;
        int pro=1;
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a[i]=j;
            j*=nums[i];
        }
        int k=1;
        for(int i=nums.length-1;i>=0;i--){
            a[i]*=k;
            k*=nums[i];
        }
        return a;

        
    }
}