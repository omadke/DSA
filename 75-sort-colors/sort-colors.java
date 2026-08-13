class Solution {
    public void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int start =0;
        int end =n-1;
        int idx =0;

        while(idx<=end){
            if(nums[idx]==0){
                swap(nums,idx,start);
                idx++;
                start++;
            }
            else if(nums[idx]==2){
                swap(nums,idx,end);
                end--;
            }
            else{
                idx++;
            }
        }
        
    }
}