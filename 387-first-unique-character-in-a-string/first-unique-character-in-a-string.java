class Solution {
    public int firstUniqChar(String s) {
        
        int n = s.length();
        HashMap<Character,Integer> freq = new HashMap <>();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }

        for(int j=0;j<n;j++){

            if(freq.get(s.charAt(j))== 1){
                return j;
            }
        }
        
        return -1;
    }
}