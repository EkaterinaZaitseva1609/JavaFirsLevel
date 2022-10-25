package ru.gb.java_Sergey.Home_work_3;

public class Main {

    public static void main(String[] args) {

        testDfs();
    }

    private static void testDfs() {
        Graph graph = new Graph(8);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");


        graph.addEdges("A", "B", "C", "D");
        graph.addEdges("B", "E");
        graph.addEdges("D", "F");
        graph.addEdges("F", "G");
        graph.addEdges("H","E","G");
        graph.addEdges("C","H");

        graph.display();
        System.out.println("=========BFS========");
        graph.bfs("A");
        //A B C D E H F G

    }


}
