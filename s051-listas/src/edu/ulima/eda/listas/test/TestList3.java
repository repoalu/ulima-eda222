/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.listas.test;

import edu.ulima.eda.listas.LinkedList;
import edu.ulima.eda.listas.Node;

/**
 *
 * @author jc
 */

//Implemente un algoritmo que reciba una lista enlazada y retorne una nueva
//lista que contenga solamente a los elementos de orden impar
public class TestList3 {
    
    public static LinkedList getSublist(LinkedList list){
        LinkedList filteredList = new LinkedList();
        int position = 1;
        //Obtener una referencia al primer elemento de la lista
        Node ptr = list.getL();
        //Recorrer lista
        while(ptr != null){
            //Solamente si la posicion es impar
            if(position % 2 != 0){
                //Agregar a la lista de respuesta
                filteredList.addLast(ptr.value());
            }
            ptr = ptr.next();
            position = position + 1;
        }
        return filteredList;
    }
    
    
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        list1.addLast(10);
        list1.addLast(20);
        list1.addLast(30);
        list1.addLast(40);
        list1.showElements();
        
        getSublist(list1).showElements();
    }
}
