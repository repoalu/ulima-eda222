/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.guias.g01;

/**
 *
 * @author jc
 */
public class Prob03 {
    public static boolean isPrime(int N){
        boolean result = false;
        int count = 0;
        for(int i = 1; i <= N; i++){
            //Residuo = 0: Es divisor
            if(N % i == 0){
                count = count + 1;
            }
        }
        //Numero primo: Tiene 2 divisores
        //Alternativa: result = count == 2;
        if(count == 2){
            result = true;
        }else{
            result = false;
        }
        
        return result;
    }
    
    public static void main(String[] args){
        int n1 = 12;
        int n2 = 13;
        
        System.out.println(n1 + " es primo: " + isPrime(n1));
        System.out.println(n2 + " es primo: " + isPrime(n2));
    }
}
