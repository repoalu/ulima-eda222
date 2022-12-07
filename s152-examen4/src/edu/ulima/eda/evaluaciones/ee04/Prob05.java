/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.evaluaciones.ee04;

/**
 *
 * @author jc
 */
public class Prob05 {
    
    public static void printConnectedCities(int[][] connectionsGraph, 
            String[] cityArray, String cityName){
        System.out.println("Ciudades conectadas a " + cityName + ":");
        int cityIndex = getCityIndex(cityArray, cityName);
        for(int j = 0; j < connectionsGraph.length; j++){
            if(connectionsGraph[cityIndex][j] == 1){
                System.out.println(cityArray[j]);
            }
        }
    }
    
    public static int getCityIndex(String[] cityArray, String cityName){
        for(int i = 0; i < cityArray.length; i++){
            if(cityArray[i].equals(cityName)){
                return i;
            }
        }
        //No encontrado
        return -1;
    }
    
    public static void main(String[] args){
        int G[][] = {
                        {0, 0, 1},
                        {1, 0, 1},
                        {0, 1, 0}
                    };
        String[] A = {"Lemon City", "Apple City", "Paradise City"};
        printConnectedCities(G, A, "Apple City");
    }
}
