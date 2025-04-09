class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean ins=true;
        boolean dec=true;
       for(int i=1;i<nums.length;i++){
        if(!ins && !dec) return false;
        if(nums[i-1]>nums[i]) ins=false;
        else if(nums[i-1]<nums[i]) dec=false;
       }
       if(ins||dec) return true;
       else return false;
    }
}