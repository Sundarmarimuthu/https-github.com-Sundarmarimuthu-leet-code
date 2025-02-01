        
class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        int i;
        for (i = 0; i <= n - 2; i++) {
            if ((nums[i] % 2 == 0) && (nums[i + 1] % 2 == 0) || 
                (nums[i] % 2 == 1) && (nums[i + 1] % 2 == 1)) {
                return false;
            }
        }
        return true;
    }
}
