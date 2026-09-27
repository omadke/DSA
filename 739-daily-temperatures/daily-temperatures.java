class Solution {
    public int[] dailyTemperatures(int[] arr) {
        
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];

        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                res[i] = 0;
            }
            else{
                int diff = st.peek()-i;
                res[i] = diff;
            }
            st.push(i);
        }
        return res;
    }
}