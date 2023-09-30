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
    /* 
    Graph Class:

This class represents a graph using an adjacency list.
It has private instance variables:
V: The number of vertices in the graph.
adj: An array of linked lists, where each element in the array represents a vertex, and the linked list stores its adjacent vertices.
Constructor:

The Graph constructor takes an integer v as a parameter, representing the number of vertices in the graph.
It initializes the V variable and creates an array of linked lists (adj) with a length of v. Each linked list represents the adjacency list for a vertex.
addEdge Method:

This method allows you to add an edge between two vertices in the graph.
It takes two integer parameters v and w, indicating that there is a directed edge from vertex v to vertex w.
It adds vertex w to the adjacency list of vertex v.
DFSUtil Method:

This is a private recursive helper method for performing Depth-First Search (DFS) starting from a specific vertex.
It takes two parameters: an integer v (the current vertex) and a boolean array visited that keeps track of visited vertices.
It marks the current vertex as visited by setting visited[v] to true and prints the vertex value.
Then, it recursively explores all unvisited neighbors of the current vertex by calling DFSUtil on them.
DFS Method:

This method allows you to perform DFS traversal starting from a specific vertex.
It takes one parameter, an integer v, which is the starting vertex for DFS traversal.
It initializes a boolean array visited with false values to keep track of visited vertices.
It calls the DFSUtil method to start the DFS traversal from vertex v.
main Method:

The main method is the entry point of the program.
It creates an instance of the Graph class with 7 vertices.
It adds edges to the graph to create a simple directed graph with multiple branches.
Finally, it calls the DFS method starting from vertex 0 and prints the result of the DFS traversal.
Overall Functionality:

This code demonstrates how to create a graph and perform Depth-First Search (DFS) traversal starting from a specified vertex.
The DFS algorithm explores vertices and their neighbors in a depth-first manner, printing the visited vertices in the order they are encountered.
    */

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
