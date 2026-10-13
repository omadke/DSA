class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int res = 0;

        int temp = nums[low];

        if(temp<nums[high]){
            return temp;
        }

        if(low==high){
            return temp;
        }

        while(low<=high){
            int guess = (low+high)/2;

            if(temp<=nums[guess]){
                low = guess+1;
            }

            else{
                res = nums[guess];
                high = guess-1;
            }
        }
        return res;

    }
}