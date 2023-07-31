package com.suraj.AdjacencyMatrix;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    // to store values
    ArrayList<Node> nodeList = new ArrayList<Node>();
    // to store edges
    int[][] adjacencyMatrix;

    public Graph(ArrayList<Node> nodeList){
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i, int j){
        // adding edge from index i to j and j to i
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    public void show()
    {
        System.out.print(" ");
        for (int i = 0; i < nodeList.size(); i++) {
            System.out.print(" " + nodeList.get(i).name);
        }
        System.out.println();
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            System.out.print(nodeList.get(i).name + " ");
            for (int j = 0; j < adjacencyMatrix.length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // get neighbors
    public ArrayList<Node> getNeighbors(Node node){
        ArrayList<Node> neighbors = new ArrayList<>();
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if(adjacencyMatrix[node.index][i] == 1){
                neighbors.add(nodeList.get(i));
            }
        }
        return neighbors;
    }

//    for a single node
    public void bfsVisit(Node node){
        // queue for adding visited nodes
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()){
            Node currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<Node> neighbors = new ArrayList<>();
            for(Node neighbor : neighbors){
                if(!neighbor.isVisited){
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    public void bfs(){
        System.out.print("BFS Traversal : ");
        for(Node node: nodeList){
            if(!node.isVisited){
                bfsVisit(node);
            }
        }
    }





}
