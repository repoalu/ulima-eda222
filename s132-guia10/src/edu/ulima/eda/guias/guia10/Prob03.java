/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia10;

import edu.ulima.eda.arboles.Node;
import edu.ulima.eda.arboles.abb.BinarySearchTree;

/**
 *
 * @author JC
 */
public class Prob03 {
    //Precondicion: Arbol no esta vacio
    public static int max(Node root){
        Node ptr = root;
        while(ptr.right() != null){
            ptr = ptr.right();
        }
        return ptr.value();
    }
    
    public static void main(String[] args){
        //Crear el nodo raíz
        Node root = new Node(200);
        BinarySearchTree.insert(root, 180);
        BinarySearchTree.insert(root, 160);
        BinarySearchTree.insert(root, 270);
        BinarySearchTree.insert(root, 240);
        BinarySearchTree.insert(root, 290);
        BinarySearchTree.insert(root, 300);
        System.out.println("Valor maximo del arbol: " + max(root));
    }
}
