/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.guias.g05;

import edu.ulima.eda.listas.LinkedList;
import edu.ulima.eda.listas.Node;

/**
 *
 * @author jc
 */
public class Prob01 {
    
    public static int countElements(LinkedList list){
        int count = 0;
        //Crear nodo auxiliar y asignar al primer elemento de la lista
        Node ptr = list.getL();
        while(ptr != null){
            count = count + 1;
            ptr = ptr.next();
        }
        return count;
    }
    
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addLast(12);
        list.addLast(20);
        list.addLast(35);
        list.addLast(50);
        list.addLast(66);
        list.showElements();
        
        System.out.println("Cantidad de elementos: " + countElements(list));
    }
}
