/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.grafos.test;

import edu.ulima.eda.colas.Queue;
import edu.ulima.eda.grafos.Graph;

/**
 *
 * @author JC
 */
public class TestGraph {
    public static void main(String args[]){
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);        
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        Queue q = g.dfs(3);
        q.showElements();
        q = g.bfs(0);
        q.showElements();
              
    }
}
