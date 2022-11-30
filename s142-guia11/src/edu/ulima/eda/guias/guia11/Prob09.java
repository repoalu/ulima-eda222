/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.guias.guia11;

/**
 *
 * @author JC
 */
public class Prob09 {
    public static void showDegrees(int[][] G){
        for(int i = 0; i < G.length; i++){
            int sum = 0;
            for(int j = 0; j < G.length; j++){
                sum = sum + G[i][j];
            }
            System.out.println("Grado del vertice " + i + ": " + sum);
        }
    }
    
    public static void main(String[] args){
        int[][] G = {//  0  1  2  3  4 
                /*0*/   {0, 1, 0, 0, 1},
                /*1*/   {1, 0, 1, 1, 1},
                /*2*/   {0, 1, 0, 1, 0},
                /*3*/   {0, 1, 1, 0, 1},
                /*4*/   {1, 1, 0, 1, 0}
            };
        showDegrees(G);
    }
}
