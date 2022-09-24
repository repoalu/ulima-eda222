/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.guias.g03;

import java.util.Arrays;

/**
 *
 * Implemente un algoritmo que reciba una matriz M y muestre en pantalla
 * el valor maximo de cada fila de la matriz.
 * La funcion debera retornar un array con todos estos valores
 */

public class Prob15 {
    
    public static int[] getMaxValues(int[][] M){
        int[] ans = new int[M.length];
        for(int i = 0; i < M.length; i++){
            //Asumimos que el primer elemento de la fila es el maximo
            int max = M[i][0];
            for(int j = 0; j < M[0].length; j++){
                if(M[i][j] > max){
                    max = M[i][j];
                }
            }
            System.out.println("Valor maximo fila " + i + ": " + max);
            ans[i] = max;
        }
        return ans;
    }
    
    public static void main(String[] args){
        int[][] M = {
                        {1, 2, 13},
                        {14, 5, 6},
                        {7, 9, 8}
                    };
        System.out.println(Arrays.toString(getMaxValues(M)));
    }
}
