class Solution {
    public int hIndex(int[] citations) {
        
        Arrays.sort(citations);
        int n = citations.length;
        
        if(citations[n-1]==0) return 0;
        
        int i = 0;
        while(i<n){
            if(n-i<=citations[i]){
                return n-i;
            }else{
                i++;
            }
        }
        return 1;
    }
}