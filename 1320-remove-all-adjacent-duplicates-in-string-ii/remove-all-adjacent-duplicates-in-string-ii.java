class Pair {
    char ch;
    int count;

    Pair(char ch, int count) {
        this.ch = ch;
        this.count = count;
    }
}

class Solution {
    public String removeDuplicates(String s, int k) {
        
        Stack<Pair> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        int n = s.length();
        

        for(int i=0;i<n;i++){

            if(st.isEmpty()){
                st.push(new Pair(s.charAt(i), 1));
                continue;
            }

            if(st.peek().ch == s.charAt(i)){
                if(st.peek().count == k-1){
                    st.pop();
                    continue;
                }
                st.peek().count++;
            }
            else{
            st.push(new Pair(s.charAt(i), 1));
            }
        }

        while (!st.isEmpty()) {
            Pair p = st.pop();

             for (int j = 0; j < p.count; j++) {
                 res.append(p.ch);
    }
}

        res = res.reverse();
        return res.toString();  
    }
}