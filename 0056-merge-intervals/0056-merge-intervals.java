class Solution {
    public int[][] merge(int[][] intervals) {
        
        List<int[]> list = new ArrayList<>();
        
        int[] startval = new int[intervals.length];
        int[] endval = new int[intervals.length];
        
        for(int i = 0; i<intervals.length; i++){
            startval[i]=intervals[i][0];
            endval[i]=intervals[i][1];
        }
        
        Arrays.sort(startval);
        Arrays.sort(endval);
        
        int curlow = startval[0];
        int curhi = endval[0];
        
        for(int i = 1; i <= intervals.length; i++){
            while((i<intervals.length) && (startval[i]<=curhi)){
                curhi=endval[i];
                i++;
            }
            
            list.add(new int[]{curlow,curhi});
            
            if (i<intervals.length){
                curlow=startval[i];
                curhi=endval[i];
            }
        }

        return list.toArray(new int[0][]);

    }
}