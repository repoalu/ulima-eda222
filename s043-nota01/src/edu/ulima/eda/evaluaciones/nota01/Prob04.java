/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.evaluaciones.nota01;

import java.util.Arrays;

/**
 *
 * @author jc
 */
public class Prob04 {
    public static boolean isPrime(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count = count + 1;
            }
        }
        if(count == 2){
            return true;
        }else{
            return false;
        }
    }
    
    public static int[] mergeAndTransform(int[] A, int[] B, int exponent){
        int[] newArray = new int[A.length + B.length];
        for(int i = 0; i < A.length; i++){
            int value = A[i];
            if(isPrime(A[i]) == true){
                value = (int) Math.pow(value, exponent);
            }
            newArray[i] = value;
        }
        
//Esta operacion se repite. Explore como se podria utilizar una funcion
        for(int i = 0; i < B.length; i++){
            int value = B[i];
            if(isPrime(B[i]) == true){
                value = (int) Math.pow(value, exponent);
            }
            newArray[A.length + i] = value;
        }
        return newArray;
    }
    
    public static void main(String[] args){
        int A[] = {10, 12, 7};
        int B[] = {3, 14, 26};
        System.out.println(Arrays.toString(mergeAndTransform(A, B, 2)));
    }
}
