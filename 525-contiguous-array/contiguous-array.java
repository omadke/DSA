class Solution {
    public int findMaxLength(int[] nums) {

        int zero =0;
        int one =0;
        int diff =0;
        int max_len =0;

        HashMap<Integer,Integer>my_map = new HashMap<>();
        my_map.put(0,-1);

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            if(nums[i]==1){
                one++;
            }

            diff = zero-one;

            if(my_map.containsKey(diff)){
                int len = i-my_map.get(diff);
                max_len = Math.max(max_len, len);
            }

            if(!my_map.containsKey(diff)){
                my_map.put(diff,i);
            }
        }
        return max_len;
        
    }
}