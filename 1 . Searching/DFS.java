import java.util.*;

class Graph {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adj; // Adjacency list

    // Constructor
    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    // Function to add an edge to the graph
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // Recursive DFS function starting from vertex v
    private void DFSUtil(int v, boolean[] visited) {
        // Mark the current vertex as visited
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the adjacent vertices
        for (Integer neighbor : adj[v]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    // DFS traversal starting from vertex v
    public void DFS(int v) {
        // Mark all vertices as not visited
        boolean[] visited = new boolean[V];

        // Call the recursive helper function to perform DFS
        DFSUtil(v, visited);
    }
}

public class DFS {
    public static void main(String[] args) {
        Graph g = new Graph(7);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);

        System.out.println("Depth-First Traversal (starting from vertex 0): ");
        g.DFS(0);
    }
}
/*This Java program demonstrates Depth-First Search (DFS) traversal on a graph. Here's a short description of its key components:

1. `Graph` Class:
   - Represents an undirected graph using an adjacency list.
   - `V` is the number of vertices in the graph.
   - `adj` is an array of linked lists, where each element represents a vertex, and its linked list contains its adjacent vertices.

2. `Graph` Constructor:
   - Initializes the graph with a given number of vertices (`V`).
   - Creates an array of linked lists to store adjacency information for each vertex.

3. `addEdge` Method:
   - Adds an edge between two vertices in the graph by adding the second vertex to the adjacency list of the first vertex.

4. `DFSUtil` Method:
   - A private helper method that performs a recursive Depth-First Search starting from a given vertex (`v`).
   - It marks the current vertex as visited and prints it.
   - Recursively explores all unvisited adjacent vertices of the current vertex.

5. `DFS` Method:
   - Initiates a Depth-First Search traversal from a specified starting vertex.
   - It creates a boolean array to keep track of visited vertices and initializes all vertices as not visited.
   - Calls the `DFSUtil` method to start the DFS traversal.

6. `main` Method:
   - The program's entry point.
   - Creates an instance of the `Graph` class with 7 vertices.
   - Adds edges to create a sample graph.
   - Initiates a DFS traversal starting from vertex 0 and prints the traversal result.

The program demonstrates the DFS algorithm by exploring vertices and their neighbors in a depth-first manner, printing the order in which they are visited.*/
