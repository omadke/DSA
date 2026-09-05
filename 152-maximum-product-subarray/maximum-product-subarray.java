class Solution {
    public int maxProduct(int[] nums) {

        int bestending = nums[0];
        int min_ending = nums[0];
        int res = nums[0];
        int n = nums.length;

        for(int i=1;i<n;i++){
            int v1 = nums[i];
            int v2 = bestending * nums[i];
            int v3 = min_ending * nums[i];

            bestending = Math.max(v1, Math.max(v2,v3));
            min_ending = Math.min(v1, Math.min(v2,v3));

            res = Math.max(res, Math.max(bestending, min_ending));
        }
        return res;
    }
}