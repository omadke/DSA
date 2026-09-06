class Solution {
    public int maximumSum(int[] arr) {

        int nodelete = arr[0];
        int res = arr[0];
        int onedelete = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i=1;i<n;i++){
            int privious_nodelete = nodelete;
            int privious_onedelete = onedelete;

            nodelete = Math.max(nodelete+arr[i], arr[i]);

            int var;
            if(privious_onedelete == Integer.MIN_VALUE){
                var = privious_nodelete;
            }
            else{
                var = privious_onedelete + arr[i];
            }
        
            onedelete = Math.max(var, privious_nodelete);
            int v = Math.max(onedelete, nodelete);

            res = Math.max(res, v);
        }
        return res;
    }
}