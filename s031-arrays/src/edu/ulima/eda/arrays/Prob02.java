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

/*
Implemente un programa que reciba un array A que contiene notas (asuma que
los valores son validos. Su algoritmo debe retornar el promedio de estas notas.
*/

public class Prob02 {
    
    public static float getAverage(int[] grades){
        float average;
        int sum = 0;
        //Recorrido de array
        for(int i = 0; i < grades.length; i++){
            sum = sum + grades[i];
        }
        average = 1.0f * sum / grades.length;
        return average;
    }
    
    public static void main(String[] args){
        int[] grades = {10, 17, 11, 8, 14, 5};
        System.out.println("Notas: " + Arrays.toString(grades));
        System.out.println("El promedio es: " + getAverage(grades));
    }
}
