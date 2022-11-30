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
public class Prob06 {
    
    public static void printAdjacents(LinkedList[] G, int X){
        LinkedList list = G[X];
        Node ptr = list.getL();
        while(ptr != null){
            System.out.println("Vertice " + ptr.value() + " es adyacente");
            ptr = ptr.next();
        }
    }
    
    public static boolean areAdjacents(LinkedList[] G, int X, int Y){
        boolean found = false;
        //Obtener lista de adyacencias de X
        LinkedList list = G[X];
        
        //Buscar si el vertice Y se encuentra en la lista
        Node ptr = list.getL();
        //Continuar mientras haya mas elementos y no se haya encontrado Y
        while(ptr != null && found == false){
            if(ptr.value() == Y){
                found = true;
            }
            ptr = ptr.next();
        }
        return found;
    }
    
    public static void main(String[] args){
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
        
        printAdjacents(adjacencies, 3);
        System.out.println(areAdjacents(adjacencies, 0, 1));
    }
}
