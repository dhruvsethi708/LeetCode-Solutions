class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);

        int cnt = 0;
        int j = 0;
        for(int i = 0; i<g.length && i<s.length; i++){
            while(j<s.length){
                if(s[j] >= g[i]){
                    cnt++;
                    s[j] = 0;
                    break;
                }
                j++;
            }
        }
        
        return cnt;
    }
}