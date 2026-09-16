class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> res = new ArrayList<>();
        boolean insert = false;
        for(int i=0;i<intervals.length;i++){
            int start1 = intervals[i][0];
            int end1 = intervals[i][1];

            if(insert==false && start1>=newInterval[0]){
                res.add(new int[]{newInterval[0], newInterval[1]});
                insert = true;
            }
            
            res.add(new int[]{start1, end1});

        }
        if(insert==false){
            res.add(new int[]{newInterval[0], newInterval[1]});
        }

        List<int[]> finalres = new ArrayList<>();
        int s1 = res.get(0)[0];
        int e1 = res.get(0)[1];

        for(int i=1;i<res.size();i++){
            int s2 = res.get(i)[0];
            int e2 = res.get(i)[1];

            if(e1>=s2){
                s1 = s1;
                e1 = Math.max(e1,e2);
            }
            else{
                finalres.add(new int[]{s1,e1});
                s1 = s2;
                e1 = e2;
            }
        }
        finalres.add(new int[]{s1,e1});
        return finalres.toArray(new int[finalres.size()][]);

        
    }
}