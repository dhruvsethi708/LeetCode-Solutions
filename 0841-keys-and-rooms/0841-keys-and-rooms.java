class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        boolean visited[] = new boolean[rooms.size()];
        visited[0] = true;
        
        // List<List<Integer>> adj = new ArrayList<>(rooms);
        
        Stack<Integer> keys = new Stack<>();
        keys.add(0);
        
        while(!keys.isEmpty()){
            int currentkey = keys.pop();
            
            for(int newkey: rooms.get(currentkey)){
                if(!visited[newkey]){
                    visited[newkey] = true;
                    keys.add(newkey);
                }
            }
        }
        
        
        for(boolean seen: visited){
            if(seen==false) return false;
        }
        return true;
    }
}