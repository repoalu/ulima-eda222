/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.grafos.pesos;

import edu.ulima.eda.listas.genericas.LinkedList;
import edu.ulima.eda.listas.genericas.Node;
import edu.ulima.eda.colas.Queue;
import java.util.Arrays;
/**
 *
 * @author JC
 */
public class Graph {
    //Cantidad de vertices
    private final int V;
    //Cantidad de aristas
    private int E;
    //Matriz de adyacencias
    private int[][] adjMatrix;    
    //Lista de aristas del grafo (ordenada por peso)
    private LinkedList<Edge> edgeList; 
    
    private static final int INFINITE = Integer.MAX_VALUE;
    
    public Graph(int vertices){
        this.V = vertices;
        this.E = 0;
        //Por defecto, Java asigna cero a todos los valores
        adjMatrix = new int[vertices][vertices];
        edgeList = new LinkedList<>();
    }
    
    public void addEdge(int source, int target, int weight){
        adjMatrix[source][target] = weight;
        adjMatrix[target][source] = weight;
        Edge edge = new Edge(source, target, weight);
        if(source < target){
            addEdgeToList(edge);
        }
        
    }
    
    private void addEdgeToList(Edge edge){
        Node<Edge> ptr = edgeList.getL();
        if(ptr != null){
            boolean inserted = false;            
            while(ptr != null && inserted == false){
                Edge currEdge = ptr.value();
                if(edge.weight() < currEdge.weight()){
                    edgeList.addBefore(currEdge, edge);
                    inserted = true;
                }
                ptr = ptr.next();
            }
            if(inserted == false){
                edgeList.addLast(edge);
            }
        }else{
                edgeList.addFirst(edge);
        }
    }
    public void showMst(){
        LinkedList<Edge> edges = kruskal();
        Node<Edge> ptr = edges.getL();
        int totalWeight = 0;
        System.out.println("Arbol de Expansion Minimo");
        while(ptr != null){
            Edge currEdge = ptr.value();
            System.out.println(currEdge);
            totalWeight = totalWeight + currEdge.weight();
            ptr = ptr.next();
        }
        System.out.println("Peso total: " + totalWeight);
        
    }
    
    private LinkedList<Edge> kruskal(){
        LinkedList<Edge> mstEdges = new LinkedList<>();
        Node<Edge> ptr = edgeList.getL();
        while(ptr != null){
            Edge currEdge = ptr.value();
            if(formsCycle(currEdge, mstEdges) == false){
                mstEdges.addLast(currEdge);
            }                        
            ptr = ptr.next();
        }
        return mstEdges;
    }
    
    private boolean formsCycle(Edge e, LinkedList<Edge> edges){
        boolean[] visited = new boolean[this.V];        
        Queue pending = new Queue();
        pending.enqueue(e.source());
        visited[e.source()] = true;       
        while(pending.isEmpty() == false){                        
            int next = pending.dequeue();
            for(int j = 0; j < this.V; j++){
                if(this.adjMatrix[next][j] > 0 && 
                        (findEdge(edges, next, j) == true || findEdge(edges, j, next) == true)){
                    if(j == e.target()){
                        return true;
                    }else if(visited[j] == false){
                        pending.enqueue(j);
                        visited[j] = true;                    
                    }
                }
            }
        }
        return false;
    }
    
    private boolean findEdge(LinkedList<Edge> edgeList, int source, int target){
        Node<Edge> ptr = edgeList.getL();
        while(ptr != null){
            Edge edge = ptr.value();
            if(edge.source() == source && edge.target() == target){
                return true;
            }
            ptr = ptr.next();
        }
        return false;
    }
    
    
    public void dijkstra(int source){
        int[] distances = new int[this.V];
        boolean[] visited = new boolean[this.V];        
        initialize(distances, visited);
        distances[source] = 0;
        
        for(int it = 1; it < this.V; it++){
            //Obtener el vertice que tenga la minima distancia desde el origen
            //(considerar solo los que no hayan sido visitados)
            int i = getMinDistVertex(distances, visited);
            visited[i] = true;
            //Explorar los vertices adyacentes al actual
            for(int j = 0; j < this.V; j++){
                /*
                Condiciones:
                1) Vertice adyacente (j) no haya saido visitado.
                2) Exista una arista que conecte a i con j.
                */
                if(visited[j] == false && adjMatrix[i][j] != 0){
                    //distancia[j] = distancia desde el origen hasta el vertice i + 
                    //               longitud de arista que conecta i con j  
                    int dist = distances[i] + adjMatrix[i][j];
                    //Si la distancia calculada es menor que la distancia almacenada
                    //para llegar al nodo j, reemplazarla
                    if(dist < distances[j]){
                        distances[j] = dist;
                    }
                }
            }
        }
        showShortestPath(source, distances);
    }
    
    private void initialize(int[] distances, boolean[] visited){
        for(int i = 0; i < this.V; i++){
            distances[i] = INFINITE;
            visited[i] = false;
        }
    }
    
   
    private int getMinDistVertex(int[] distances, boolean[] visited){
        int minValue = INFINITE;
        int minIndex = -1;
        
        for(int i = 0; i < this.V; i++){
            if(visited[i] == false && distances[i] < minValue){
                minValue = distances[i];
                minIndex = i;                
            }
        }
        return minIndex;
    }
    
    public void showShortestPath(int source, int[] distances ){
        System.out.println("Vertice origen: " + source);
        System.out.println("Distancias a cada vertice");
        for(int i = 0; i < distances.length; i++){
            if(i != source){
                System.out.println("Vertice " + i + ": " + distances[i]);
            }            
        }
        
    }
            
            
    public void showMatrix(){
        for(int i = 0; i < adjMatrix.length; i++){
            System.out.println(Arrays.toString(adjMatrix[i]));
        }        
    }
    public void showEdges(){
        edgeList.showElements();
    }
    
}