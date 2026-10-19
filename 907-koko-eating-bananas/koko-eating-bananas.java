class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max = Math.max(max,piles[i]);
        }

        int low =1;
        int high = max;
        int res = -1;

        while(low<=high){
            int guess = (low+high)/2;

            long hr =0;
            for(int j=0;j<piles.length;j++){
                hr = hr + piles[j]/guess;
                if(piles[j]%guess != 0){
                    hr++;
                }
            }

            if(hr>h){
                low = guess+1;
            }
            else{
                res = guess;
                high = guess-1;
            }
            
        }
        return res;
    }
}