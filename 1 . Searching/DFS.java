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

