/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.evaluaciones.examen02;

import edu.ulima.eda.listas.LinkedList;
import edu.ulima.eda.listas.Node;

/**
 *
 * @author jc
 */

/*
Implemente un programa que reciba una lista enlazada L que almacena elementos
positivos y retorne una nueva lista que contenga solamente aquellos elementos 
que sean mayores que su predecesor
*/

public class Prob04 {
    
    public static LinkedList filter(LinkedList values){
        LinkedList ans = new LinkedList();
        Node ptr = values.getL();
        int pred = -1;
        while(ptr != null){
            if(pred != -1 && ptr.value() > pred){
                ans.addLast(ptr.value());
            }
            pred = ptr.value();
            ptr = ptr.next();
        }
        return ans;
    }
    
    public static void main(String[] args){
        LinkedList values = new LinkedList();
        values.addLast(10);
        values.addLast(20);
        values.addLast(30);
        values.addLast(13);
        values.showElements();       
        filter(values).showElements();
    }
}
