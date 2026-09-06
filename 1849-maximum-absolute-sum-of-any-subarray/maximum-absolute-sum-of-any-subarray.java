class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int bestending1 = nums[0];
        int bestending2 = nums[0];
        int max_sum = nums[0];
        int min_sum = nums[0];
        int n = nums.length;
        int res = nums[0];
        
        for(int i=1;i<n;i++){
            bestending1 = Math.max(bestending1+nums[i], nums[i]);
            bestending2 = Math.min(bestending2+nums[i], nums[i]);

            max_sum = Math.max(max_sum, bestending1);
            min_sum = Math.min(min_sum, bestending2);

            res = Math.max(Math.abs(max_sum), Math.abs(min_sum));

        }
        return Math.abs(res);
        
    }
}