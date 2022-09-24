/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.arrays;

import java.util.Arrays;

/**
 *
 * @author jc
 */

//Implemente un algoritmo que reciba un array A, un entero i y retorne el
//cuadrado del elemento que ocupa la posición i en el array



public class Prob01 {
    //En caso el valor de i se encuentre fuera de rango, retorna -1
    public static int getSquare(int[] A, int i){
        int ans = -1;
        //Si Valor de i dentro del rango
        if(i >= 0 && i < A.length){
            ans = A[i] * A[i];
        }
        return ans;
    }
    
    
    public static void main(String[] args){
        //Declarar e inicializar
        int[] values = new int[3];
        //Imprimir valores
        System.out.println(Arrays.toString(values));
        //Asignar valores
        values[0] = 1;
        values[1] = 12;
        values[2] = 15;
        System.out.println(Arrays.toString(values));
        System.out.println(getSquare(values, 3));
    }

}
