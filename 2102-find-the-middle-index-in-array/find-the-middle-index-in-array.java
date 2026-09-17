class Solution {
    public int findMiddleIndex(int[] nums) {

        int left =0;
        int right =0;
        int sum =0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            sum = sum + nums[i];
        }
        
        for(int j=0;j<n;j++){

            if(j==0){
                left =0;
                right = sum-left-nums[j];
                if(left==right){
                    return j;
                }
                j++;
            }

            left = left + nums[j-1];
            right = sum-left-nums[j];

            if(left==right){
                return j;
            }        
            
        }
        return -1;
        
    }
}