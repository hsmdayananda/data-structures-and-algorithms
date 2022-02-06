package com.daa.samples.dfs;

public class DepthFirstSearch<T> {

    public void traverse(Vertex<T> startVertex) {
        startVertex.setVisited(true);
        System.out.println(startVertex);
        startVertex.getNeighbors().stream().filter(neighbour-> !neighbour.isVisited()).forEach(vertex -> traverse(vertex));
    }
}
