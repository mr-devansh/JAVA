package Graphs;
import java.util.*;

public class connectedComponentDFS {
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
    public static void dfs(ArrayList<edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
                dfsUtil(graph, i, vis);
        }
    }
    public static void dfsUtil(ArrayList<edge>[] graph, int curr, boolean vis[]) {
        System.out.print(curr+" ");
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (!vis[e.d]) {
                dfsUtil(graph, e.d, vis);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
