import java.util.Arrays;

public class Prims {
    public static void primMST(int[][] graph) {
        int n = graph.length;
        int[] parent = new int[n]; // Array to store the MST
        int[] key = new int[n]; // Key values used to pick the minimum weight edge
        boolean[] mstSet = new boolean[n]; // To track vertices included in the MST

        // Initialize key values to a large number and mstSet to false
        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(mstSet, false);

        // Start with the first vertex
        key[0] = 0;
        parent[0] = -1; // The first vertex has no parent

        for (int i = 0; i < n - 1; i++) {
            // Find the vertex with the minimum key value from the set of vertices not yet included in the MST
            int minKey = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int v = 0; v < n; v++) {
                if (!mstSet[v] && key[v] < minKey) {
                    minKey = key[v];
                    minIndex = v;
                }
            }

            mstSet[minIndex] = true; // Include the selected vertex in the MST

            // Update key values and parent indices of adjacent vertices
            for (int v = 0; v < n; v++) {
                if (graph[minIndex][v] != 0 && !mstSet[v] && graph[minIndex][v] < key[v]) {
                    parent[v] = minIndex;
                    key[v] = graph[minIndex][v];
                }
            }
        }

        // Print the MST
        System.out.println("Edge   Weight");
        for (int i = 1; i < n; i++) {
            System.out.println(parent[i] + " - " + i + "    " + graph[i][parent[i]]);
        }
    }

    public static void main(String[] args) {
        int n = 5; // Number of vertices
        int[][] graph = {
                {0, 2, 0, 6, 0},
                {2, 0, 3, 8, 0},
                {0, 3, 0, 0, 0},
                {6, 8, 0, 0, 9},
                {0, 0, 0, 9, 0}
        };

        primMST(graph);
    }
}
