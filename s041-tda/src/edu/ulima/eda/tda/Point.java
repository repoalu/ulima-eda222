/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.tda;

/**
 *
 * Implemente el TDA Punto, el cual representara un punto en R^2,
 * con coordenadas x, y. Debe tener las siguientes operaciones:
 * - Crear: Recibe abscisa y ordenada y crea un punto.
 * - Imprimir: Muestra un mensaje con el valor de abscisa y ordenada.
 * - obtenerDistancia: Recibe como parametro otro TDA Punto (P) y retorna
 * la longitud del segmento que une el punto actual con el punto P.
 */
public class Point {    
    //Almacenaremos las coordenadas en un array de tamano 2. el primer
    //valor sera la abscisa y el segundo sera la ordenada
    int[] coordinates;
    
    //Metodo crear -> Constructor
    public Point(int x, int y){
        coordinates = new int[2];
        coordinates[0] = x;
        coordinates[1] = y;
    }
    
    public int getX(){
        return coordinates[0];
    }
    
    public int getY(){
        return coordinates[1];
    }
    
    public void print(){
        System.out.println("La abscisa es: " + coordinates[0]);
        System.out.println("La ordenada es: " + coordinates[1]);
    }
    
    public double getDistance(Point ref){
        //Diferencia de abscisas
        int diffX = ref.getX() - this.getX();
        //Diferencia de ordenadas
        int diffY = ref.getY() - this.getY();
        //Aplicar formula
        return Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
    }
    
}
