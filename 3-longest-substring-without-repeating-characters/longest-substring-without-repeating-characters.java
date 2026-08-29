import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> freq=new HashMap<>();
        int low =0;
        int res = 0;
        int n = s.length();
        
        for(int high=0;high<n;high++){
            char c = s.charAt(high);
            freq.put(c, freq.getOrDefault(c,0)+1);

            int k = high-low+1;

            while(freq.size()<k){
                char left_c= s.charAt(low);
                freq.put(left_c, freq.getOrDefault(left_c,0)-1);
                
                if(freq.get(left_c)==0){
                    freq.remove(left_c);
                }
                low++;
                k = high-low+1;
            }
            
            res = Math.max(res, high-low+1);


        }

        return res;
        
    }
}