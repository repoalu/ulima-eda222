/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.intro;

/**
 *
 * @author jc
 */

//Implemente un programa que reciba un numero entero y calcule la suma de
//sus digitos pares (no use funciones de cadenas, procese cada digito)

public class Prob02 {
    
    public static int sumEvenDigits(int N){
        int result = 0;
        while(N != 0){
            int digit = N % 10;
            if(digit % 2 == 0){
                result = result + digit;
            }
            N = N / 10;
        }
        
        
        return result;
    }
    
    
    public static void main(String[] args){
        int N = 41924;
        System.out.println(N % 10);
        System.out.println(N / 10);
        int N1 = 4192 / 10;
        System.out.println(N1 / 10);
        
        int result = sumEvenDigits(N);
        System.out.println("Suma de digitos pares de " + N + ": " + result);
        
    }
}
