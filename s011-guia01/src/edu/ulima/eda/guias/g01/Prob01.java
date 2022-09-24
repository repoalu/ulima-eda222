/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.guias.g01;

/**
 *
 * @author jc
 */
public class Prob01 {
    
    public static int max(int n1, int n2, int n3){
        //Asumir que el primer numero es el mayor
        int max = n1;
        //Si el segundo es mayor que el primero, reemplazamos
        if(max < n2){
            max = n2;
        }
        //Si el tercero es el mayor de todos, reemplazamos
        if(max < n3){
            max = n3;
        }
        return max;
    }
    
    public static void main(String[] args){
        int n1 = 3;
        int n2 = 15;
        int n3 = 7;
        int result = max(n1, n2, n3);
        System.out.println("El maximo numero es: " + result);
        
    }
}
