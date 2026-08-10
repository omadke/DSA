class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int res_sum =0;
         int min_diff = Integer.MAX_VALUE;

        for(int i=0; i<n-2; i++){
            int j=i+1;
            int k=n-1;
            int diff;

            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==target){
                    res_sum = sum;
                    break;
                }

                if(sum<target){
                    diff = Math.abs(sum-target);
                    if(diff<min_diff){
                        min_diff=diff;
                        res_sum=sum;
                    }
                    j++;
                }

                if(sum>target){
                    diff = Math.abs(sum-target);
                    if(diff<min_diff){
                        min_diff=diff;
                        res_sum=sum;
                    }
                    k--;
                    
                }
            }
            
        
        }
        
     return res_sum;         
    }
    
}