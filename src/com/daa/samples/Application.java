package com.daa.samples;

import com.daa.samples.dfs.DepthFirstSearch;
import com.daa.samples.dfs.Vertex;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Vertex<String> vX = new Vertex<>("X");
        Vertex<String> vC = new Vertex<>("C");
        Vertex<String> vE = new Vertex<>("E");
        Vertex<String> vx = new Vertex<>("x");
        Vertex<String> vG = new Vertex<>("G");
        Vertex<String> vA = new Vertex<>("A");
        Vertex<String> vB = new Vertex<>("B");
        Vertex<String> vD = new Vertex<>("D");
        Vertex<String> vF = new Vertex<>("F");


        vX.setNeighbors(Arrays.asList(vC,vA));
        vC.setNeighbors( Arrays.asList(vX,vE));
        vE.setNeighbors(Arrays.asList(vC,vF,vG));
        vG.setNeighbors(Arrays.asList(vE,vD));
        vA.setNeighbors(Arrays.asList(vX,vB));
        vB.setNeighbors(Arrays.asList(vA,vF,vD));
        vD.setNeighbors(Arrays.asList(vB,vF,vG));
        vF.setNeighbors(Arrays.asList(vB,vE,vD));

        new DepthFirstSearch<String>().traverse(vX);}

}
