package com.suraj.AdjacencyMatrix;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Node> nodeList = new ArrayList<>();
        nodeList.add(new Node("A",  0));
        nodeList.add(new Node("B",  1));
        nodeList.add(new Node("C",  2));
        nodeList.add(new Node("D",  3));
        nodeList.add(new Node("E",  4));

        /*
        Given Graph
        A -- B
        | \    \
        |   \    E
        C -- D /
         */

        Graph graph = new Graph(nodeList);
        graph.addUndirectedEdge(0, 1);
        graph.addUndirectedEdge(0, 2);
        graph.addUndirectedEdge(0, 3);
        graph.addUndirectedEdge(1, 4);
        graph.addUndirectedEdge(2, 3);
        graph.addUndirectedEdge(3, 4);

        graph.show();
        graph.bfs();

    }
}
