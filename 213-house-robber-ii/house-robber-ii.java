class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
         int case1 = robLinear(Arrays.copyOfRange(nums, 0, nums.length - 1));
        
        int case2 = robLinear(Arrays.copyOfRange(nums, 1, nums.length));
        
        return Math.max(case1, case2);
    }
    private int robLinear(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        
        int prev2 = 0; 
        int prev1 = 0; 
        
        for (int i = 0; i < n; i++) {
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }
        
        return prev1;
    }
}