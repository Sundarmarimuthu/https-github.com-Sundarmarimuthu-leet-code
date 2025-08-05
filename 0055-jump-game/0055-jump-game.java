class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int left=n-1;
        for(int i=n-2;i>=0;i--){
            if(i+nums[i]>=left) left=i;
        }
        return left==0;
        
    }
}