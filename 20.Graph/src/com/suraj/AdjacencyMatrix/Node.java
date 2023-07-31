package com.suraj.AdjacencyMatrix;

public class Node {

    public String name;
    public int index;
    // for traversal BFS
    public boolean isVisited = false;

    public Node(String name, int index){
        this.name = name;
        this.index = index;
    }

}
