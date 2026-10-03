class Solution {
    public int maxNumberOfBalloons(String text) {
        
        HashMap<Character,Integer> have = new HashMap<>();
        HashMap<Character,Integer> need = new HashMap<>();
        int n = text.length();
        int res = Integer.MAX_VALUE;

        need.put('b',1);
        need.put('a',1);
        need.put('l',2);
        need.put('o',2);
        need.put('n',1);

        for(int i=0;i<n;i++){
            char ch = text.charAt(i);
            have.put(ch,have.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> i : need.entrySet()){
            int needed = i.getValue();
            int having = have.getOrDefault(i.getKey(),0);
            int times = having/needed;

            res = Math.min(res,times);
        }

        return res;
    }
}