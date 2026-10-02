class Solution {
    public boolean canConstruct(String ran, String mag) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        int n = mag.length();
        int m = ran.length();

        for(int i=0;i<n;i++){
            char ch = mag.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int j=0;j<m;j++){
            if(map.containsKey(ran.charAt(j))){
                char c = ran.charAt(j);
                map.put(c, map.getOrDefault(c,0)-1);

                if(map.get(ran.charAt(j)) == 0){
                    map.remove(ran.charAt(j));
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}