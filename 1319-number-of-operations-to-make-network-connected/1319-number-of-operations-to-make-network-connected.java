class Solution {
    
    int noofcomponent;
    public int makeConnected(int n, int[][] connections) {
        
        if(connections.length<n-1) return -1;
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i<connections.length; i++){
            adj.get(connections[i][0]).add(connections[i][1]);
            adj.get(connections[i][1]).add(connections[i][0]);
        }
        
        boolean[] visited = new boolean[n];
        
        for(int i = 0; i<n; i++){
            if(!visited[i]){
                dfs(i, adj, visited);
                noofcomponent++;
            }
        }
        
        return noofcomponent-1;
    }
    
    void dfs(int v, List<List<Integer>> adj, boolean[] visited){
        
        visited[v] = true;
        
        for(int edge: adj.get(v)){
            if(!visited[edge]){
                dfs(edge, adj, visited);
            }
        }
    }
}