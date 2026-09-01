import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> freqMap= new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch,0)+1);
        }

        int ucc = freqMap.size();   //ucc = unique character count
        int startindex =-1;
        int low=0;
        int min_len= Integer.MAX_VALUE;
        int n = s.length();

        for(int high=0;high<n;high++){
            char ch = s.charAt(high);
            if(freqMap.containsKey(ch)){
                freqMap.put(ch,freqMap.get(ch)-1);
                if(freqMap.get(ch)==0){
                    ucc--;
                }
            }

            while(ucc==0){
                int len = high-low+1;
                if(len<min_len){
                    min_len= len;
                    startindex=low;
                }

                ch = s.charAt(low);
                if(freqMap.containsKey(ch)){
                    freqMap.put(ch,freqMap.get(ch)+1);
                    if(freqMap.get(ch)>0){
                        ucc++;
                    }
                }
                low++;
            }
        }

        if(startindex==-1){
            return "";
        }
        return s.substring(startindex, startindex+min_len);
    }
}