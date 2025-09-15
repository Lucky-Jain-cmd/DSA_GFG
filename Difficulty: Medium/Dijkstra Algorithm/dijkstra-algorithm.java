import java.util.*;

class Solution {
    
    static class Pair {
        int node, weight;
        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }
    
    public int[] dijkstra(int V, int[][] edges, int src) {
        // Step 1: Create adjacency list
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            adj.get(u).add(new Pair(v, w));
            adj.get(v).add(new Pair(u, w)); // because undirected
        }
        
        // Step 2: Distance array
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        
        // Step 3: Priority Queue (min-heap) based on distance
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        pq.add(new Pair(src, 0));
        
        // Step 4: Dijkstra's algorithm
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int u = curr.node;
            int d = curr.weight;
            
            for (Pair neighbor : adj.get(u)) {
                int v = neighbor.node;
                int w = neighbor.weight;
                
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }
        
        return dist;
    }
}
