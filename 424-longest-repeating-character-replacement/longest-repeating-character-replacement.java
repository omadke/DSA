import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> freq= new HashMap<>();

        int low =0;
        int max_freq =0;
        int res=0;
        int n= s.length();

        for(int high=0;high<n; high++){
            char c = s.charAt(high);
            freq.put(c, freq.getOrDefault(c,0)+1);
            max_freq = Math.max(max_freq, freq.get(c));

            while((high-low+1)-max_freq > k){
                char left_c = s.charAt(low);
                freq.put(left_c, freq.getOrDefault(left_c,0)-1);
                low++;

                max_freq = Math.max(max_freq, freq.get(c));
            }

            res = Math.max(res, high-low+1);
        }

        return res;
        
    }
}