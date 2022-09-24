/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.intro;

/**
 *
 * @author jc
 */

//Implemente un algoritmo que reciba 2 numeros enteros, imprima en pantalla
//el mayor de ellos y retorne su producto

public class Prob01 {
    public static int product(int n1, int n2){
        int result = n1 * n2;
        if(n1 > n2){
            System.out.println("El primer numero es mayor");
        }else if(n1 < n2){
            System.out.println("El segundo numero es mayor");
        }else{
            System.out.println("Los numeros son iguales");
        }
        return result;
    }
    
    public static void main(String[] args) {
        int prod = product(4, 4);
        System.out.println("Producto: " + prod);
    }
}
