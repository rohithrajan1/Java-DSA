package Graph;

public class Main {
    public static void main(String [] arg ){
        graph newGraph = new graph();
        newGraph.addVertex("A");
        newGraph.addEdge("A" , "B");
        newGraph.addEdge("A" , "C");
        newGraph.addEdge("C" , "B");
        newGraph.printGraph();
        System.out.println("\n");
        newGraph.removeVertex("A");
        newGraph.printGraph();
    }
}
