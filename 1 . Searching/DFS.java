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

/*This Java code represents an implementation of Depth-First Search (DFS) algorithm for traversing a graph. Here's an explanation of the code step by step:

1. Import Statements:
   ```java
   import java.util.*;
   ```
   This code begins by importing the necessary Java libraries. In this case, it imports `java.util.*`, which includes classes and interfaces for data structures like LinkedList and ArrayList, as well as other utilities like the Arrays class.

2. `Graph` Class:
   The `Graph` class is the main data structure for representing a graph. It has the following attributes and methods:

   - `private int V`: This variable stores the number of vertices in the graph.
   - `private LinkedList<Integer>[] adj`: This is an array of LinkedLists where each element in the array represents a vertex, and the LinkedList for each vertex stores its adjacent vertices.

   - `public Graph(int v)`: This is the constructor for the `Graph` class. It takes an integer `v` as input, which represents the number of vertices in the graph. It initializes the `V` and `adj` variables and creates an adjacency list for each vertex.

   - `public void addEdge(int v, int w)`: This method is used to add an edge between vertices `v` and `w` in the graph. It adds `w` to the adjacency list of `v`, indicating that there is a connection between `v` and `w`.

   - `private void DFSUtil(int v, boolean[] visited)`: This is a recursive utility function for performing the DFS traversal. It takes a starting vertex `v` and an array `visited` to keep track of visited vertices. It marks the current vertex as visited, prints it, and then recursively visits all unvisited adjacent vertices.

   - `public void DFS(int v)`: This is the public method to initiate the DFS traversal. It creates a boolean array `visited` to keep track of visited vertices and calls the `DFSUtil` function starting from vertex `v`.

3. `DFS` Class:
   The `DFS` class is the main class containing the `main` method, which serves as the entry point for the program. In the `main` method:

   - An instance of the `Graph` class named `g` is created with 7 vertices.
   - Edges are added to the graph using the `addEdge` method to define the connectivity between vertices.
   - It then initiates a Depth-First Search traversal starting from vertex 0 using the `DFS` method of the `Graph` class.
   - The result of the traversal is printed, showing the order in which vertices are visited.

Overall, this code demonstrates how to create a graph, add edges to it, and perform a Depth-First Search traversal starting from a specified vertex. In this particular example, it starts the DFS traversal from vertex 0 and prints the visited vertices in the order they are encountered.*/
