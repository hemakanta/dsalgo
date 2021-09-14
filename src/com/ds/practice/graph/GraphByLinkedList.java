package com.ds.practice.graph;

import java.util.Arrays;
import java.util.LinkedList;

public class GraphByLinkedList {
	
	int V;
	LinkedList<Integer>[] adj;
	
	GraphByLinkedList(int vertexNo)
	{
		this.V = vertexNo;
		this.adj = new LinkedList[this.V];
		for(int i=0; i<this.V; i++)
		{
			this.adj[i] = new LinkedList<Integer>();
		}
		
	}
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	public void printGraph() {
		
		Arrays.stream(adj).forEach(item->System.out.print(" -> "+ item));  // Printing by using Java Stream
		for(int i = 0; i< adj.length; i++) {
			LinkedList<Integer> nod  = adj[i];
			
			System.out.println("\nAdjacency list of vertex " + i); 
            System.out.print("head");
            nod.forEach(item->System.out.print(" -> "+item));
			/*for(int j=0; j<nod.size(); j++)
			{
				System.out.print(" -> "+nod.get(j));
			}*/
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphByLinkedList g = new GraphByLinkedList(4); 
		  
		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
        
        g.printGraph();

	}

}
