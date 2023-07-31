package com.suraj.AdjacencyList;

import java.util.ArrayList;

public class Node {
    public String name;
    public int index;

    // to add all neighbors to the vertx
    ArrayList<Node> neighbors = new ArrayList<>();

    public Node(String name, int index){
        this.name = name;
        this.index = index;
    }
}
