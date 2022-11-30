/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.grafos.pesos;

/**
 *
 * @author JC
 */
public class Edge{
    private int source;
    private int target;
    private int weight;
    
    public Edge(int source, int target, int weight){
        this.source = source;
        this.target = target;
        this.weight = weight;
    }

    public int source() {
        return source;
    }

    public int target() {
        return target;
    }

    public int weight() {
        return weight;
    }
        
    @Override
    public boolean equals(Object obj){
        boolean ans = false;
        if(obj instanceof Edge){    
            Edge ref = (Edge) obj;
            if(this.source == ref.source() && this.target == ref.target()){
                ans = true;
            }
        }
        return ans;
    }
       
    @Override
    public String toString(){
        String ans = "Arista " + source + "-" + target + " / Peso: " + weight;
        return ans;
    }
 
}
