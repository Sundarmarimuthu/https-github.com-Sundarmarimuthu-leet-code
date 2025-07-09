class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length == 0 || k == 0 || k > nums.length || nums == null) return 0.0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double avg=sum/k;
        double maxavg=avg;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            avg=sum/k;
            maxavg=Math.max(maxavg,avg);
        }
       
        return maxavg;
        
    }
}