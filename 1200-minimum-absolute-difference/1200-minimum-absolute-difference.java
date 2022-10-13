class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);

        int diff = Integer.MAX_VALUE;
        
        for(int i = 0; i<arr.length-1; i++){
            if(Math.abs(arr[i]-arr[i+1])<diff){
                diff = Math.abs(arr[i]-arr[i+1]);
            }
        }
        
        
        
        for(int i = 0; i<arr.length-1; i++){
            
            ArrayList<Integer> temp = new ArrayList<>();
            
              if(Math.abs(arr[i+1]-arr[i])==diff){
                    temp.add(arr[i]);
                    temp.add(arr[i+1]);
              }  
            
            if(temp.size()!=0) res.add(temp);
        }
        
        return res;
    }
}