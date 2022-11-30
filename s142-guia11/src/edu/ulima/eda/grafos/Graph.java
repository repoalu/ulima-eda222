/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.grafos;

import edu.ulima.eda.colas.Queue;
import edu.ulima.eda.listas.LinkedList;
import edu.ulima.eda.listas.Node;

/**
 *
 * @author JC
 */
public class Graph {
    private final int V;
    private int E;
    private LinkedList[] adjLists;
    
    public Graph(int vertices){
        this.V = vertices;
        this.E = 0;
        adjLists = new LinkedList[vertices];
        for(int i = 0; i < vertices; i++){
            adjLists[i] = new LinkedList();
        }
    }
    
    public void addEdge(int source, int target){
        adjLists[source].addLast(target);
        adjLists[target].addLast(source);
        this.E = this.E + 1;
    }
    
    public Queue dfs(int source){
        Queue ans = new Queue();
        dfs(source, initializeVisited(), ans);
        return ans;
    }
    
    private void dfs(int source, boolean[] visited, Queue path){
        visited[source] = true;
        path.enqueue(source);
        LinkedList adj = this.adjLists[source];
        Node ptr = adj.getL();
        while(ptr != null){
            int target = ptr.value();
            if(visited[target] == false){
                dfs(target, visited, path);
            }
            ptr = ptr.next();
        }        
    }

    private boolean[] initializeVisited(){
        boolean[] visited = new boolean[this.V];
        for(int i = 0; i < V; i++){
            visited[i] = false;
        }
        return visited;        
    }
        
    public Queue bfs(int source){
        Queue ans = new Queue();        
        boolean[] visited = initializeVisited();
        
        Queue pending = new Queue();
        pending.enqueue(source);
        ans.enqueue(source);
        visited[source] = true;
        while(pending.isEmpty() == false){
            int next = pending.dequeue();
            Node ptr = adjLists[next].getL();
            while(ptr != null){
                int adjNode = ptr.value();
                if(visited[adjNode] == false){
                    pending.enqueue(adjNode);
                    ans.enqueue(adjNode);
                    visited[adjNode] = true;
                }
                ptr = ptr.next();
            }
        }
        return ans;
    }
    
}
