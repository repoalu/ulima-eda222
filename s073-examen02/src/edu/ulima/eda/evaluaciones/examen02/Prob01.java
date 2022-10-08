/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.evaluaciones.examen02;

import java.util.Arrays;

/**
 *
 * @author jc
 */

//Implemente un algoritmo que reciba un array y muestre aquellos elementos
//que no terminen en un digito par. Estos elementos se reemplazan por el valor -1


public class Prob01 {
    
    public static void showList(int[] values){
        for(int i = 0; i < values.length; i++){
            int lastDigit = values[i] % 10;
            if(lastDigit % 2 != 0){
                System.out.println(values[i]);
                values[i] = -1;
            }
        }
    }

    public static void main(String[] args){
        //Casos de prueba
        int[] values = {12, 14, 25, 15, 60};
        System.out.println("Array antes: " + Arrays.toString(values));
        showList(values);
        System.out.println("Lista despues: " + Arrays.toString(values));
    }

    
}
