/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.guias.g01;

/**
 *
 * @author jc
 */
public class Prob04 {
    public static int getDigit(int n, int i){
        //Nos conviene eliminar los i-1 ultimos digitos del numero
        //Para ello calculamos un factor = 10^i-1
        int factor = (int) Math.pow(10, i - 1);
        //Con ello obtenemos un nuevo numero
        int newNumber = n / factor;
        //El ultimo digito de este numero sera la respuesta
        int digit = newNumber % 10;
        return digit;
        
    }
    
    public static void main(String[] args){
        int n = 1223;
        int i = 1;
        System.out.println(getDigit(n, i));
    }
}
