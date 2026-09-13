class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum =0;
        int res =0;

        for(int i=0;i<nums.length;i++){

            sum = sum+nums[i];
            int rem = sum%k;

            //to handle negative rem
            if(rem<0){
                rem = rem%k +k;
            }

            if(map.containsKey(rem)){
                res = res + map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem,0)+1);
        }

        return res;
        
    }
}