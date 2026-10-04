class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character,Integer> map = new HashMap <>();
        int n = s.length();
        int even_count = 0;
        int odd_count = 0;
        int res =0;
        int odd =0;

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> i : map.entrySet()){

            int num = i.getValue();

            if(num%2==0){
                even_count = even_count + num;
            }
            else{
                int val = num-1;
                 odd = odd + val;
                odd_count = odd + 1;
            }

            res = even_count + odd_count;
        }
        return res;
    }
}