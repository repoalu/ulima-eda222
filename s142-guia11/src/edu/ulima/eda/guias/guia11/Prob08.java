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
public class Prob08 {
    public static boolean isDirected(int[][] G){
        boolean ans = true;
        for(int i = 0; i < G.length; i++){
            for(int j = 0; j < G.length; j++){
                if(G[i][j] != G[j][i]){
                    ans = false;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[][] G = {        //  0  1  2  3  4 
                /*0*/   {0, 1, 0, 0, 1},
                /*1*/   {1, 0, 1, 1, 1},
                /*2*/   {0, 1, 0, 1, 0},
                /*3*/   {0, 1, 1, 0, 1},
                /*4*/   {1, 1, 0, 1, 0}
            };
        System.out.println(isDirected(G));
    }
}
