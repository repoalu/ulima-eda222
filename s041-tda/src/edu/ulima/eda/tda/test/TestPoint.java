/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ulima.eda.tda.test;

import edu.ulima.eda.tda.Point;

/**
 *
 * @author jc
 */
public class TestPoint {
    public static void main(String[] args){
        Point p = new Point(0, 1);
        p.print();
        Point p1 = new Point(3, 4);
        p1.print();
        
        System.out.println(p1.getX());
        
        System.out.println(p1.getDistance(p));
    }
}
