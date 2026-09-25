class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        int n = s.length();

        for(int i=0;i<n;i++){
            
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{' ){
                st.push(s.charAt(i));
                continue;
            }

            if(st.isEmpty()){
                return false;
            }

            if(s.charAt(i)==')' && st.peek()=='('){
                st.pop();
                continue;
            }
            if(s.charAt(i)==']' && st.peek()=='['){
                st.pop();
                continue;
            }
            if(s.charAt(i)=='}' && st.peek()=='{'){
                st.pop();
                continue;
            }
            return false;
        }

        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}