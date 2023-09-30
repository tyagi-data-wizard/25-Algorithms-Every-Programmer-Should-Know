/*Given an undirected graph with V vertices and E edges and a node X, The task is to find the level of node X in the undirected graph. If X does not exist in the graph then return -1.

Note: Traverse the graph starting from vertex 0.*/

// Java code to implement the approach

import java.util.*;
class GFG {

	// Driver code
	public static void main(String[] args)
	{
		int V = 5;
		int[][] edges
			= { { 0, 1 }, { 0, 2 }, { 1, 3 }, { 2, 4 } };
		int X = 3;

		// Function call
		int level = findLevel(V, edges, X);
		System.out.println(level);
	}

	// Function to find the level of the node
	public static int findLevel(int N, int[][] edges, int X)
	{
		int maxVertex = 0;
		for (int[] it : edges) {
			maxVertex = Math.max(maxVertex,
								Math.max(it[0], it[1]));
		}

		// Creating adjacency list
		ArrayList<Integer>[] adj
			= new ArrayList[maxVertex + 1];

		for (int i = 0; i <= maxVertex; i++)
			adj[i] = new ArrayList<>();

		for (int i = 0; i < edges.length; i++) {
			adj[edges[i][0]].add(edges[i][1]);
			adj[edges[i][1]].add(edges[i][0]);
		}

		// X is not present
		if (X > maxVertex || adj[X].size() == 0)
			return -1;

		// Queue for BFS traversal
		LinkedList<Integer> q = new LinkedList<>();
		q.offer(0);
		int level = 0;

		boolean[] visited = new boolean[maxVertex + 1];

		// BFS traversal
		while (!q.isEmpty()) {
			int sz = q.size();
			while (sz-- > 0) {
				int currentNode = q.poll();

				if (currentNode == X)
					return level;

				for (int it : adj[currentNode]) {
					if (!visited[it]) {
						q.offer(it);
						visited[it] = true;
					}
				}
			}
			level++;
		}

		return -1;
	}
}
/*The provided Java code aims to find the level of a given node X in an undirected graph. If X is not present in the graph, the code returns -1. The graph is represented as an array of edges, and the traversal starts from vertex 0. Here's a description of the code:

1. **Main Method (`public static void main(String[] args)`)**:
   - This is the entry point of the program.
   - It initializes the number of vertices `V`, an array of edges `edges`, and the node `X` that you want to find the level for.
   - It calls the `findLevel` function to calculate the level of node X in the graph.
   - Finally, it prints the level to the console.

2. **`findLevel` Method (`public static int findLevel(int N, int[][] edges, int X)`)**:
   - This method calculates the level of the given node `X` in the graph.
   - It takes three arguments:
     - `N`: The number of vertices in the graph.
     - `edges`: An array of edges, where each element is an array of two integers representing an edge between two vertices.
     - `X`: The node for which you want to find the level.
   - It calculates the maximum vertex number by iterating through the edges and finding the maximum vertex number encountered.

3. **Creating Adjacency List**:
   - It creates an adjacency list `adj` to represent the graph, where each vertex is associated with a list of its adjacent vertices.
   - It initializes an ArrayList for each vertex in the range `[0, maxVertex]`.

4. **Populating Adjacency List**:
   - It populates the adjacency list by iterating through the edges and adding both endpoints of each edge to each other's adjacency lists. This is done because the graph is undirected.

5. **Checking for Node Existence**:
   - It checks if the given node `X` is greater than the maximum vertex number or if it has no adjacent vertices. If either condition is met, it means `X` is not present in the graph, and it returns -1.

6. **Breadth-First Search (BFS)**:
   - It performs a BFS traversal starting from vertex 0 to find the level of node `X`.
   - It uses a queue `q` to keep track of vertices to visit in the BFS traversal.
   - It initializes the `level` to 0 and maintains a boolean array `visited` to mark visited vertices.

7. **BFS Traversal**:
   - It enters a loop while the queue `q` is not empty.
   - Inside the loop, it processes vertices at the current level.
   - For each vertex, it checks if it is equal to the target node `X`. If yes, it returns the current level as the result.
   - If the target node is not found, it enqueues all unvisited adjacent vertices and marks them as visited.
   - The level is incremented after processing all vertices at the current level.

8. **Returning -1 if Node X is not Found**:
   - If the BFS traversal completes, and the target node `X` is not found, it returns -1 to indicate that `X` does not exist in the graph.

Overall, this Java program finds the level of a given node `X` in an undirected graph using a BFS traversal starting from vertex 0 and returns -1 if the node is not present in the graph.*/
