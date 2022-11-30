package edu.ulima.eda.guias.guia11;

/**
 *
 * @author JC
 */
public class Prob05 {
    public static void printAdjacents(int[][] G, int X){
        for(int j = 0; j < G.length; j++){
            if(G[X][j] == 1){
                System.out.println("Vertice " + j + " es adyacente");
            }
        }
    }
    
    public static boolean areAdjacents(int[][] G, int X, int Y){
        if(G[X][Y] == 1){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args){
        int[][] G = {        //  0  1  2  3  4 
                        /*0*/   {0, 1, 0, 0, 1},
                        /*1*/   {1, 0, 1, 1, 1},
                        /*2*/   {0, 1, 0, 1, 0},
                        /*3*/   {0, 1, 1, 0, 1},
                        /*4*/   {1, 1, 0, 1, 0}
                    };
        printAdjacents(G, 2);
        System.out.println(areAdjacents(G, 2, 0));
    }
}
