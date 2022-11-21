class Solution {
    
    int dirx[] = {1,0,-1,0};
    int diry[] = {0,1,0,-1};
    
    public int nearestExit(char[][] maze, int[] entrance) {
        int R = maze.length;
        int C = maze[0].length;
        int r = entrance[0];
        int c = entrance[1];
        
        Queue<int[]> q = new ArrayDeque<>();
        
        boolean[][] visited = new boolean[R][C];
        visited[r][c] = true;
        
        q.add(entrance);
        
        int answer = 0;
        
        while(!q.isEmpty()){
            
            answer++;
            int qsize = q.size();
            
            for(int i=0;i<qsize;i++){
                int[] cur = q.poll();
                for(int j=0;j<4;j++){
                    int x = cur[0]+dirx[j];
                    int y = cur[1]+diry[j];
                    if(x<0||x>=R||y<0||y>=C||visited[x][y]||maze[x][y]=='+'){
                        continue;
                    }
                    visited[x][y]=true;
                    
                    q.offer(new int[]{x,y});
                    
                    if(x==0||y==0||x==R-1||y==C-1){
                        return answer;
                    }
                }
            }
        }
        return -1;
    }
}