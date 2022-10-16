class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        // nCr = nC(r - 1) * (n - r + 1) / r
        
        Integer[] ans = new Integer[rowIndex+1];
        ans[0] = 1;
        
        for(int r = 1; r<=rowIndex; r++){
            ans[r] = (int)((long)ans[r-1]*(rowIndex-r+1)/r);
        }
        
        return Arrays.asList(ans);
        
    }
}