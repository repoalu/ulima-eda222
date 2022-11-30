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
public class TestMst {
    public static void main(String args[]){       
        /*
                2
            (0)------(1)
             |  \     |
            5|   8    4
             |      \ |
            (2)------(3)
                 3      
        */       
                        
        Graph g = new Graph(4);
        g.addEdge(0, 1, 2);
        g.addEdge(0, 2, 5);
        g.addEdge(0, 3, 8);
        g.addEdge(1, 3, 4);
        g.addEdge(2, 3, 3);
        g.showMatrix();
        g.showEdges();
        g.showMst();
    }    
}
