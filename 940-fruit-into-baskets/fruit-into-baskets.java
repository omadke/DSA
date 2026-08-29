import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        int low =0;
        int k = 2;
        int n = fruits.length;
        int res = 0;

        for(int high=0;high<n;high++){
            int f = fruits[high];
            freq.put(f, freq.getOrDefault(f,0)+1);

            while(freq.size()>k){
                int left_f = fruits[low];
                freq.put(left_f, freq.getOrDefault(left_f,0)-1);

                if(freq.get(left_f)==0){
                    freq.remove(left_f);
                }
                low++;
            }

                res = Math.max(res, high-low+1);
            
        }

        return res;


        
    }
}