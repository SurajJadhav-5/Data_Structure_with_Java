package com.suraj.AdjacencyList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        // create nodes to add in graph
        ArrayList<Node> nodeList = new ArrayList<>();
        nodeList.add(new Node("A", 0));
        nodeList.add(new Node("B", 1));
        nodeList.add(new Node("C", 2));
        nodeList.add(new Node("D", 3));
        nodeList.add(new Node("E", 4));

        // create graph
        Graph graph = new Graph(nodeList);


        /*
        Given Graph
        A -- B
        | \    \
        |   \    E
        C -- D /
         */

        // add edges between nodes
        graph.addUndirectedEdge(0, 1);
        graph.addUndirectedEdge(0, 2);
        graph.addUndirectedEdge(0, 3);
        graph.addUndirectedEdge(1, 4);
        graph.addUndirectedEdge(2, 3);
        graph.addUndirectedEdge(3, 4);

        graph.show();



    }
}
