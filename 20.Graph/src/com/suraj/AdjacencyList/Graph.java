package com.suraj.AdjacencyList;

import java.util.ArrayList;

public class Graph {

    ArrayList<Node> nodeList = new ArrayList<>();

    public Graph(ArrayList<Node> nodeList){
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i, int j){
        Node first = nodeList.get(i);
        Node second = nodeList.get(j);

        // creating undirected edge between two nodes i.e. adding neighbors to each other
        first.neighbors.add(second);
        second.neighbors.add(first);
    }

    public void show(){
        for (int i = 0; i < nodeList.size(); i++) {
            System.out.print(nodeList.get(i).name
            );

            for (int j = 0; j < nodeList.get(i).neighbors.size(); j++) {
                System.out.print(" -> " + nodeList.get(i).neighbors.get(j).name );
            }
            System.out.println();
        }
    }
}

