/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.evaluaciones.examen02;

/**
 *
 * @author jc
 */
//Dada una matriz M implemente un programa que muestre los elementos de la
//diagonal. Ademas retorne la suma de estos elementos.

public class Prob02 {
    public static int showDiagonal(int[][] M){
        int sum = 0;
        for(int i = 0; i < M.length; i++){
            sum = sum + M[i][i];
            System.out.println(M[i][i]);
        }
        return sum;
    }
    
    public static void main(String[] args){
        int[][] M = {{1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}
                    };
        
        System.out.println("Suma de elementos en la diagonal: " + showDiagonal(M));
    }
}
