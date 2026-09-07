class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int bestending1 = nums[0];
        int bestending2 = nums[0];
        int total_sum = nums[0];
        int maxsum = nums[0];
        int minsum = nums[0];
        int maxsum2 = nums[0];
        int res = nums[0];
        int n = nums.length;

        for(int i=1;i<n;i++){
            bestending1 = Math.max(bestending1+nums[i], nums[i]);
            bestending2 = Math.min(bestending2+nums[i], nums[i]);

            maxsum = Math.max(maxsum, bestending1);
            minsum = Math.min(minsum, bestending2);

            total_sum = total_sum + nums[i];

        }
        if(maxsum<0){
            return maxsum;
        }

        maxsum2 = total_sum - minsum;
        res = Math.max(maxsum, maxsum2);
        return res;
        
    }
}