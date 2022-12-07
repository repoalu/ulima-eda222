/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.evaluaciones.ee04;

import edu.ulima.eda.arboles.Node;

/**
 *
 * @author jc
 */
public class Prob03 {
    
    public static void showFilteredNodes(Node root){
        if(root != null){
            int sum = 0;
            if(root.left() != null || root.right()!= null){
                if(root.left() != null){
                    sum = sum + root.left().value();
                }
                if(root.right() != null){
                    sum = sum + root.right().value();
                }
                if(root.value() > sum){
                    System.out.println("Nodo " + root.value() + 
                            " cumple la condicion");
                }                
            }
            showFilteredNodes(root.left());
            showFilteredNodes(root.right());
        }
    }
    
    public static void main(String[] args){
        /*
                    99
                  /   \
                 14   28
                /  \    \
               20  11    12
        
        */ 
        
        Node root = new Node(99);
        
        Node node2 = new Node(14);
        Node node3 = new Node(28);
        
        root.setLeft(node2);
        root.setRight(node3);
        
        Node node4 = new Node(20);
        Node node5 = new Node(11);
        
        node2.setLeft(node4);
        node2.setRight(node5);
        
        Node node6 = new Node(12);        
        node3.setRight(node6);
        
        showFilteredNodes(root);
    }    
}
