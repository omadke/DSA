class Solution {
    public int removeDuplicates(int[] nums) {
        
        int officer = 0;
        int cm = 1;
        int uni = 1;
        int n = nums.length;

        while(cm<n){
            if(nums[cm]==nums[cm-1]){
                cm++;
                continue;
             }
            else{
                nums[officer+1]=nums[cm];
                uni++;
                cm++;
                officer++;
            }
    }

    return uni;
}
}