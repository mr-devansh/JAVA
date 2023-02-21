package Graphs;

import java.util.*;

public class undirectedDFScyclesDetection {
    static class edge{
        int s;
        int d;
        public edge(int s, int d){
            this.s = s;
            this.d = d;
        } 
    }
    static void creategraph(ArrayList<edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3));

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));

        graph[3].add(new edge(3, 0));
        graph[3].add(new edge(3, 4));

        graph[4].add(new edge(4, 3) );
    }

    public static boolean detectCycle(ArrayList<edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if(util(graph, vis, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean util(ArrayList<edge> graph[], boolean vis[], int c, int p) {
        vis[c] = true;
        for (int i = 0; i < graph[c].size(); i++) {
            edge e = graph[c].get(i);
            if (!vis[e.d]){
                if(util(graph, vis, e.d, c)) {
                    return true;
                }
            }
            else if(vis[e.d] && e.d!=p){
                return true;
            }   
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<edge>[] graph = new ArrayList[v];
        creategraph(graph);
        System.out.println(detectCycle(graph)); 
    }
}
