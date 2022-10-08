/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.evaluaciones.examen02;

/**
 *
 * @author jc
 */

/*
Implemente el TDA cuadrado con las siguientes operaciones:
- Crear
- Calcular Perimetro
- CalcularArea
*/

class Square{
    private int side;
    
    public Square(int length){
        this.side = length;
    }
    
    public int getPerimeter(){
        return 4 * this.side;
    }
    
    public int getArea(){
        return this.side * this.side;
    }
}

public class Prob03 {
    public static void main(String[] args){
        Square s1 = new Square(4);
        Square s2 = new Square(5);

        System.out.println("Perimetro del primer cuadrado: " + s1.getPerimeter()); 
        System.out.println("Area del segundo cuadrado: " + s2.getArea());
    }
}





