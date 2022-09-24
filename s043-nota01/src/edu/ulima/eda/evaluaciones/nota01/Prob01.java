/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.evaluaciones.nota01;

/**
 *
 * @author jc
 */
public class Prob01 {
    //Numeros primos entre si (PESI)
    public static boolean areRelativePrimes(int M, int N){
        for(int i = 2; i <= M; i++){
            if(M % i == 0 && N % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        System.out.println(areRelativePrimes(4, 20));
        System.out.println(areRelativePrimes(9, 4));        
    }
    
}
