/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Ajay
 */
public class BFS {

        static class Graph
    {
        int n; 
        LinkedList<Integer> aj[]; 
        
        public  Graph(int a)
        {
            n=a;
            aj=new LinkedList[a];
            for (int i=0; i<a; ++i)
            {
                aj[i]=new LinkedList();
            }
        }
        
       void addEdge(int b, int e)
       {
           aj[b].add(e);
       }
       
       void BFS(int w)
       {
           boolean touched[]=new boolean[n];
           
           LinkedList<Integer> queue=new LinkedList<Integer>();
           
           touched[w]=true;
           queue.add(w);
           
           while(queue.size() != 0)
           {
               w = queue.poll();
               System.out.print(w + " ");
               
               Iterator<Integer> i =aj[w].listIterator();
               while(i.hasNext())
               {
                   int n =i.next();
                   if(!touched[n])
                   {
                       touched[n]=true;
                       queue.add(n);
                   }
               }
           }
       }
        
    }
    public static void main(String[] args) {
         Graph g = new Graph(4);
        
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1, 2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        
        
        System.out.println("The BFS is : "  );
        g.BFS(2);
    }
    
}
