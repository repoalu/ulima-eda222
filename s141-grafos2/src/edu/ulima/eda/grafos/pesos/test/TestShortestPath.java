/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.grafos.pesos.test;

import edu.ulima.eda.grafos.pesos.Graph;

/**
 *
 * @author JC
 */
public class TestShortestPath {
    public static void main(String args[]){
        Graph g = new Graph(9);
        g.addEdge(0, 1, 4);
        g.addEdge(0, 7, 8);        
        g.addEdge(1, 2, 8);;
        g.addEdge(1, 7, 11);        
        g.addEdge(2, 3, 7);
        g.addEdge(2, 5, 4);
        g.addEdge(2, 8, 2);                
        g.addEdge(3, 4, 9);
        g.addEdge(3, 5, 14);
        g.addEdge(4, 5, 10);        
        g.addEdge(5, 6, 2);
        g.addEdge(6, 7, 1);
        g.addEdge(6, 8, 6);        
        g.addEdge(7, 8, 7);
        
        g.dijkstra(0);
    }
}