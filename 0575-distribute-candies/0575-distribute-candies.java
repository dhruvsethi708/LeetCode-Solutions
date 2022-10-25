class Solution {
    public int distributeCandies(int[] candyType) {
        
        int n = candyType.length/2;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i<2*n; i++){
            map.put(candyType[i], map.getOrDefault(candyType[i],0)+1);
        }
        
        int size = map.size();
        
        if(size>n) return n;
        else return size;
    }
}