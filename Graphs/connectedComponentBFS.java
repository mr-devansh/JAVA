package Graphs;
import java.util.*;

public class connectedComponentBFS {
    static class edge{
        int s;
        int d;
        int w;
        public edge(int s, int d, int w){
            this.s = s;
            this.d = d;
            this.w = w;
        }
    }
    public static void bfs(ArrayList<edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (vis[i]) {
                bfsUtil(graph, vis);
            }
        }
    }
    public static void bfsUtil(ArrayList<edge>[] graph, boolean vis[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                System.out.print(curr+" ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    edge e = graph[curr].get(i);
                    q.add(e.d);
                }
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
