class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int V = adj.size();
        boolean visited[] = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(0,adj,visited,ans);
        return ans;
    }
    private void dfs(int node , ArrayList<ArrayList<Integer>> adj , boolean vis[], ArrayList<Integer> ans){
        vis[node]=true;
        ans.add(node);
        for(int neighbour : adj.get(node)){
            if(!vis[neighbour]){
                dfs(neighbour,adj,vis,ans);
            }
        }
    }
}