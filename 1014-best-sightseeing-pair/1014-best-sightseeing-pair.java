class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        
        int n = values.length;
        int ans = Integer.MIN_VALUE;
        int aiplusi = values[0] + 0;
        
        for(int j = 1; j<n; j++){
            //a[j]-j
            ans = Math.max(ans, aiplusi + values[j] - j);
            aiplusi = Math.max(aiplusi,values[j] + j);
        }
        
        return ans;
    }
}