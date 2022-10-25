package ru.gb.java_Sergey.Home_work_3;

import java.util.*;

public class Graph {

    private final List<Vertex> vertexList;
    private final boolean[][] adjMat;

    public Graph(int maxVertexCount) {
        this.vertexList = new ArrayList<>(maxVertexCount);
        this.adjMat = new boolean[maxVertexCount][maxVertexCount];
    }

    public void addVertex(String label) {
        vertexList.add(new Vertex(label));
    }


    private void addEdge(String startLabel, String endLabel) {
        int startIndex  = indexOf(startLabel);
        int endIndex    = indexOf(endLabel);

        if (startIndex == -1 || endIndex == -1) {
            throw new IllegalArgumentException("Invalid label for vertex");
        }

        adjMat[startIndex][endIndex] = true;
        adjMat[endIndex][startIndex] = true;
    }

    public void addEdges(String startLabel, String secondLabel, String... others) {
        addEdge(startLabel, secondLabel);
        for (String other : others) {
            addEdge(startLabel, other);
        }
    }

    private int indexOf(String startLabel) {
        for (int index = 0; index < getSize(); index++) {
            if (vertexList.get(index).getLabel().equals(startLabel)) {
                return index;
            }
        }

        return -1;
    }

    public int getSize() {
        return vertexList.size();
    }

    public void display() {
        for (int i = 0; i < getSize(); i++) {
            System.out.print(vertexList.get(i));
            for (int j = 0; j < getSize(); j++) {
                if (adjMat[i][j]) {
                    System.out.print(" -> " + vertexList.get(j));
                }
            }
            System.out.println();
        }
    }

    public void bfs(String startLabel) {
        int startIndex = indexOf(startLabel);
        if (startIndex == -1) {
            throw new IllegalArgumentException("Invalid start label");
        }

        Queue<Vertex> queue = new LinkedList<>();
        Vertex vertex = vertexList.get(startIndex);

        visitVertex(queue, vertex);
        while (!queue.isEmpty()) {
            vertex = getNearUnvisitedVertex(queue.peek());
            if (vertex != null) {
                visitVertex(queue, vertex);
            } else {
                queue.remove();
            }
        }

        resetVertexState();
    }

    private void resetVertexState() {
        for (Vertex vertex : vertexList) {
            vertex.setVisited(false);
        }
    }

    private Vertex getNearUnvisitedVertex(Vertex current) {
        int currentIndex = vertexList.indexOf(current);
        for (int i = 0; i < getSize(); i++) {
            if (adjMat[currentIndex][i] && !vertexList.get(i).isVisited()) {
                return vertexList.get(i);
            }
        }
        return null;
    }


    private void visitVertex(Queue<Vertex> queue, Vertex vertex) {
        System.out.println(vertex);
        vertex.setVisited(true);
        queue.add(vertex);
    }
}
