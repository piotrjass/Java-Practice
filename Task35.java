import java.util.ArrayList;
import java.util.List;

// GRAPHS
// url https://www.geeksforgeeks.org/problems/print-adjacency-list-1587115620/1
public class Task35 {

    public static void main(String[] args) {
        int V = 5; // liczba wierzchołków
        int[][] edges = {{0, 1}, {0, 2}, {1, 2}, {1, 3}, {2, 4}};
        System.out.println(printGraph(5,edges));
    }
    public static List<List<Integer>> printGraph(int V, int edges[][]) {

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i = 0; i < V; i++){
            List<Integer> list = new ArrayList<>();
            //list.add(i);
            ans.add(list);
        }
        System.out.println("tworzy i pustych tablic " + ans);
        for(int i = 0; i < edges.length; i++){
            ans.get(edges[i][0]).add(edges[i][1]);
            ans.get(edges[i][1]).add(edges[i][0]);
        }
        System.out.println(ans);

        return ans;

    }

    //
    public List<List<Integer>> printGraph2(int V, int edges[][]) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        return adj;
    }

    //
    static void addEdge(List<List<Integer>>adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public List<List<Integer>> printGraph3(int V, int edges[][]) {
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            addEdge(adj, edges[i][0], edges[i][1]);
        }
        return adj;
    }

}
