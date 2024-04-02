// url https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
// ????

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Task36 {

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        boolean[] visited = new boolean[V];
        visited[0] = true;
        q.offer(0);

        while(!q.isEmpty()){
            int node = q.poll();
            result.add(node);

            for(Integer i : adj.get(node))
            {
                if(!visited[i]){
                    q.offer(i);
                    visited[i] =true;
                }
            }
        }

        return result;
    }
}
