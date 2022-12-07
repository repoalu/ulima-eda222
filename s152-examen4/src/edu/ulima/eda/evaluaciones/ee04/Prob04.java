/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.evaluaciones.ee04;

import edu.ulima.eda.arboles.Node;
import edu.ulima.eda.arboles.abb.BinarySearchTree;

/**
 *
 * @author jc
 */
public class Prob04 {        
    
    public static void printInfo(Node root){
        int firstTime = root.value();
        int bestTime;
        int median = getMedian(root);
        //Mejor tiempo: (valor menor)
        Node ptr = root;
        while(ptr.left() != null){
            ptr = ptr.left();
        }
        bestTime = ptr.value();
        
        System.out.println("Tiempo obtenido por el primer estudiante: " 
                + firstTime + " segundos");        
        
        System.out.println("Mejor tiempo: " + bestTime + " segundos");
        
        System.out.println("Mediana: " + median + " segundos");               
    }
    
    //Precondicion: Cantidad de elementos impar
    public static int getMedian(Node root){
        int[] sortedValues = new int[countNodes(root)];
        getInOrderValues(root, sortedValues, 0);
        return sortedValues[sortedValues.length / 2];
    }
    
    public static int countNodes(Node root){
        if(root == null) return 0;
        else return 1 + countNodes(root.left()) + 
                countNodes(root.right());
    }
    
    //Valores ordenados: Recorrido in-orden
    public static int getInOrderValues(Node root, int[] sortedValues, int index){
        if(root != null){
            //Sub-arbol izquierdo
            index = getInOrderValues(root.left(), sortedValues, index);
            //Raiz
            sortedValues[index] = root.value();
            index = index + 1;
            //Sub-arbol derecho
            index = getInOrderValues(root.right(), sortedValues, index);
        }
        return index;
    }
    
    
    public static void main(String[] args){
        Node root = BinarySearchTree.insert(null, 80);
        BinarySearchTree.insert(root, 86);
        BinarySearchTree.insert(root, 77);
        BinarySearchTree.insert(root, 55);
        BinarySearchTree.insert(root, 112);
        BinarySearchTree.insert(root, 99);
        BinarySearchTree.insert(root, 180);
        printInfo(root);
    }

    
}
