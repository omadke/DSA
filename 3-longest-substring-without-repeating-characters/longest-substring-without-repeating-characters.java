class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>freq = new HashMap<>();
        int low =0;
        int res = 0;

        for(int high=0;high<s.length();high++){
            char ch = s.charAt(high);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            int len = high-low+1;

            while(len>freq.size()){
                char c = s.charAt(low);
                freq.put(c,freq.get(c)-1);
                low++;

                if(freq.get(c)==0){
                    freq.remove(c);
                }

                len = high-low+1;
            }

            len = high-low+1;
            res = Math.max(res,len);
        }
        return res;
    }
}