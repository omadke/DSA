class Solution {
    int countTriplets(int sum, int arr[]) {
        
        Arrays.sort(arr);
        int n = arr.length;
        int count =0;
        int res_sum =0;
        
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            
            while(j<k){
                 res_sum = arr[i]+arr[j]+arr[k];
                if(res_sum<sum){
                    count = count+(k-j);
                    j++;
                }
               
                if(res_sum>=sum){
                    k--;
                }
            }
        }
        return count;
     
     
     
        
    }
}
