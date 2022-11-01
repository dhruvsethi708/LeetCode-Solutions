class Solution {
    
    boolean ans;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        List<List<Integer>> graph = new ArrayList<>();
        
        for(int i = 0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int v[]: edges){
            graph.get(v[0]).add(v[1]);
            graph.get(v[1]).add(v[0]);
        }
        
        ans = false;
        
        boolean[] visited = new boolean[n];
        dfs(graph, visited, source, destination);
        
        return ans;
    }
    
    void dfs(List<List<Integer>> graph, boolean[] visited, int source, int destination){
        
        if(visited[source]==true || ans==true) return;
        
        if(source==destination) ans=true;
        
        visited[source] = true;
        
        for(int i: graph.get(source)){
            dfs(graph, visited, i, destination);
        }
    }
}