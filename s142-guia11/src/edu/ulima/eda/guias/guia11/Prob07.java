/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia11;

import edu.ulima.eda.listas.LinkedList;
import edu.ulima.eda.listas.Node;

/**
 *
 * @author JC
 */
public class Prob07 {
    public static void showAdjacents(int[][] G){
        for(int i = 0; i < G.length; i++){
            for(int j = 0; j < G.length; j++){
                if(G[i][j] == 1){
                    System.out.println("Vertices adyacentes: " + i + " y " + j);
                }
            }
        }
    }
    
    public static void showAdjacents(LinkedList[] adjLists){
        for(int i = 0; i < adjLists.length; i++){
            LinkedList list = adjLists[i];
            Node ptr = list.getL();
            while(ptr != null){
                System.out.println("Vertices adyacentes: " + i + " y " + ptr.value());
                ptr = ptr.next();
            }
        }
    }

    public static void main(String[] args){
        int[][] G = {        //  0  1  2  3  4 
                        /*0*/   {0, 1, 0, 0, 1},
                        /*1*/   {1, 0, 1, 1, 1},
                        /*2*/   {0, 1, 0, 1, 0},
                        /*3*/   {0, 1, 1, 0, 1},
                        /*4*/   {1, 1, 0, 1, 0}
                    };
        showAdjacents(G);
        
        
        LinkedList[] adjacencies = new LinkedList[5];
        LinkedList list;

        //Vertice 0
        list = new LinkedList();
        list.addLast(1);
        list.addLast(4);
        adjacencies[0] = list;
        
        //Vertice 1
        list = new LinkedList();
        list.addLast(0);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        adjacencies[1] = list;
        
        //Vertice 2 
        list = new LinkedList();
        list.addLast(1);
        list.addLast(3);
        adjacencies[2] = list;
        
        //Vertice 3
        list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(4);
        adjacencies[3] = list;
        
        //Vertice 4
        list = new LinkedList();
        list.addLast(0);
        list.addLast(1);
        list.addLast(3);
        adjacencies[4] = list;
        
        showAdjacents(adjacencies);
    }
    
}
