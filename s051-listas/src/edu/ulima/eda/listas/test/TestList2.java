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
public class TestList2 {
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        list1.addLast(10);
        list1.addLast(20);
        list1.addLast(30);
        list1.addFirst(33);
        list1.addFirst(6);
        list1.addLast(55);
        list1.showElements();
        
        //Suma de elementos
        int suma = 0;
        Node ptr = list1.getL();
        while(ptr != null){
            suma = suma + ptr.value();
            ptr = ptr.next();
        }     
    }
}
