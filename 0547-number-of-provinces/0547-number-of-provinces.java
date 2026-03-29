class Solution {
  
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;
        for(int i = 0;i<n;i++){
            if(!visited[i]){
                dfs(isConnected, visited, i);
                provinces++;
            }
        }
        return provinces;
    }
    private void dfs(int [][] isconnected ,boolean[]visited , int city){
        visited[city] = true;
        for(int j =0;j<isconnected.length;j++){
        if (isconnected[city][j] == 1 && !visited[j]) {
                          dfs(isconnected, visited, j);
                          
        }
    }
}}