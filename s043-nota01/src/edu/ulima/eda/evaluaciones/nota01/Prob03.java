/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.evaluaciones.nota01;

/**
 *
 * @author jc
 */
public class Prob03 {
    //Determina si el numbero es cuadrado perfecto
    public static boolean isSquare(int n){
        for(int i = 0; i < n; i++){
            if(i * i == n){
                return true;                
            }
        }
        return false;
    }
    //Determina si el numero tiene "n" cifras
    public static boolean hasDigits(int number, int n){
        int digits = 0;
        while(number > 0){
            digits++;
            number = number / 10;
        }
        if(digits == n){
            return true;
        }else{
            return false;
        }
        //Alternativa: return digits == n;
    }
    
    //Determina si el numero tiene "d" como ultimo digito
    public static boolean hasLastDigit(int number, int d){
        if(number % 10 == d){
            return true;
        }
        else{
            return false;
        }
        //Alternativa return number % 10 == d;
    }
    
    public static void printReport(int A, int B){
        int countSquare = 0;
        int countFourDigits = 0;
        int countFiveLastDigit = 0;
        
        for(int i = A; i <= B; i++){
            if(isSquare(i)){
                countSquare = countSquare + 1;
            }
            if(hasDigits(i, 4)){
                countFourDigits = countFourDigits + 1;
            }
            if(hasLastDigit(i, 4)){
                countFiveLastDigit = countFiveLastDigit + 1;
            }
        }
        System.out.println("Cantidad de cuadrados perfectos: " 
                + countSquare);
        System.out.println("Cantidad de numeros de 4 digitos: " 
                + countFourDigits);
        System.out.println("Cantidad de numeros que terminan en 5: " 
                + countFiveLastDigit);
        
    }
    
    public static void main(String[] args){
        printReport(1, 1010);
    }
            
}
