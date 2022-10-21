class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        
        int n = colsum.length;
        int[][] data = new int[2][n];
        
        for(int i = 0; i<n; i++){
            if(colsum[i]==2){
                data[0][i] = 1;
                data[1][i] = 1;
                upper--;
                lower--;
            }else if(colsum[i]==1){
                if(upper>lower){
                    data[0][i] = 1;
                    upper--;
                }else{
                    data[1][i] = 1;
                    lower--;
                }
            }
        }
        
        List<List<Integer>> res = new ArrayList<>();
        
        if(upper!=0 || lower!=0){
            return res;
        }
        
        for(int[] array: data){
            ArrayList<Integer> temp = new ArrayList<>();
            
            for(int i: array){
                temp.add(i);
            }
            
            res.add(temp);
        }
        
        return res;
        
    }
}