class Solution {
    public int longestOnes(int[] nums, int k) {

        int low =0;
        int res =0;
        int zero_freq =0;
        int n = nums.length;

        for(int high=0;high<n;high++){
            if(nums[high]==0){
                zero_freq++;
            }

            while(zero_freq>k){
                
                if(nums[low]==0){
                    zero_freq--;
                }
                low++;
            }

            res = Math.max(res, high-low+1);
        }
        return res;
    }
}