import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Edge implements Comparable<Edge> {
    int to, weight;

    public Edge(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge other) {
        return Integer.compare(this.weight, other.weight);
    }
}

public class Prims_Algorithm {
    public static List<Edge> primMST(List<List<Edge>> graph) {
        int n = graph.size();
        List<Edge> mst = new ArrayList<>();
        boolean[] visited = new boolean[n];
        PriorityQueue<Edge> pq = new PriorityQueue<>();

        // Start with any vertex as the initial node
        int startVertex = 0;
        visited[startVertex] = true;

        for (Edge edge : graph.get(startVertex)) {
            pq.add(edge);
        }

        while (!pq.isEmpty()) {
            Edge minEdge = pq.poll();

            if (visited[minEdge.to]) {
                continue;
            }

            visited[minEdge.to] = true;
            mst.add(minEdge);

            for (Edge edge : graph.get(minEdge.to)) {
                if (!visited[edge.to]) {
                    pq.add(edge);
                }
            }
        }

        return mst;
    }

    public static void main(String[] args) {
        int n = 5; // Number of vertices
        List<List<Edge>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges and their weights
        graph.get(0).add(new Edge(1, 2));
        graph.get(1).add(new Edge(0, 2));
        graph.get(1).add(new Edge(2, 3));
        graph.get(2).add(new Edge(1, 3));
        graph.get(0).add(new Edge(3, 6));
        graph.get(3).add(new Edge(0, 6));
        graph.get(1).add(new Edge(3, 8));
        graph.get(3).add(new Edge(1, 8));
        graph.get(3).add(new Edge(4, 9));
        graph.get(4).add(new Edge(3, 9));

        List<Edge> mst = primMST(graph);

        System.out.println("Minimum Spanning Tree edges:");
        for (Edge edge : mst) {
            System.out.println(edge.to + " --(" + edge.weight + ")-- " + edge.weight);
        }
    }
}
