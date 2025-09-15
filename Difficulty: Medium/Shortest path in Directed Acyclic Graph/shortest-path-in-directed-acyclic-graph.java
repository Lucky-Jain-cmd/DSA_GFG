import java.util.*;

class pair {
    int nbr;
    int weight;
    pair(int n, int w) {
        nbr = n;
        weight = w;
    }
}

class Solution {

    public int[] shortestPath(int V, int E, int[][] edges) {
        // adjacency list with pair
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            adj.get(u).add(new pair(v, w));
        }

        // topological sort
        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topoSort(i, adj, visited, st);
            }
        }

        // shortest path calculation
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        while (!st.isEmpty()) {
            int node = st.pop();
            if (dist[node] != Integer.MAX_VALUE) {
                for (pair p : adj.get(node)) {
                    if (dist[node] + p.weight < dist[p.nbr]) {
                        dist[p.nbr] = dist[node] + p.weight;
                    }
                }
            }
        }

        for (int i = 0; i < V; i++) {
            if (dist[i] == Integer.MAX_VALUE) dist[i] = -1;
        }

        return dist;
    }

    private void topoSort(int node, ArrayList<ArrayList<pair>> adj, boolean[] visited, Stack<Integer> st) {
        visited[node] = true;
        for (pair p : adj.get(node)) {
            if (!visited[p.nbr]) {
                topoSort(p.nbr, adj, visited, st);
            }
        }
        st.push(node);
    }
}