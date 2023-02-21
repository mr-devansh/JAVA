package Graphs;
import java.util.*;

public class bipartite {
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

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 3));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 4));

        graph[3].add(new edge(3, 1));
        // graph[3].add(new edge(3, 4));

        graph[4].add(new edge(4, 2) );
        // graph[4].add(new edge(4, 3) );
    }

    public static boolean isBipartite(ArrayList<edge>[] graph) {
        int colour[] = new int[graph.length];
        for (int i = 0; i < colour.length; i++) {
            colour[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (colour[i]==-1) {
                q.add(i);
                colour[i] = 0;
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        edge e = graph[curr].get(j);
                        if (colour[e.d]==-1) {
                            int next_colour = colour[curr]==0?1:0; 
                            colour[e.d] = next_colour;
                            q.add(e.d);
                        }
                        else if (colour[e.d]== colour[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<edge>[] graph = new ArrayList[v];
        creategraph(graph);
        System.out.println(isBipartite(graph)); 
    }
}


// if graph doesnt have cycles then bipartite