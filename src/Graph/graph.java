package Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class graph {
    // Adjacency List representation of the graph
    // Each vertex (String) maps to a list of its neighbors
    HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    // Print the graph (for debugging)
    public void printGraph() {
        System.out.print(adjList);
    }

    // Add a new vertex to the graph
    public void addVertex(String vertex) {
        // If vertex already exists, do nothing
        if (adjList.get(vertex) != null) {
            return;
        }
        // Otherwise, create a new entry with an empty adjacency list
        adjList.put(vertex, new ArrayList<>());
    }

    // Add an edge between vertex1 and vertex2 (Undirected)
    public void addEdge(String vertex1, String vertex2) {
        // If vertex1 doesn’t exist, add it
        if (adjList.get(vertex1) == null) {
            addVertex(vertex1);
        }
        // Add vertex2 as a neighbor of vertex1
        adjList.get(vertex1).add(vertex2);

        // If vertex2 doesn’t exist, add it
        if (adjList.get(vertex2) == null) {
            addVertex(vertex2);
        }
        // Add vertex1 as a neighbor of vertex2
        adjList.get(vertex2).add(vertex1);
    }

    // Add edge only if BOTH vertices already exist (Undirected)
    public void addEdge2(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
        }
    }

    // Remove an edge between two vertices (Undirected)
    public void removeEdge(String vertex1, String vertex2){
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
        }
    }

    // Remove a vertex and all edges connected to it
    public void removeVertex(String vertex){
        // First, remove this vertex from all of its neighbors’ adjacency lists
        for (String i : adjList.get(vertex)) {
            adjList.get(i).remove(vertex);
        }
        // Then, remove the vertex itself from the graph
        adjList.remove(vertex);
    }
}
