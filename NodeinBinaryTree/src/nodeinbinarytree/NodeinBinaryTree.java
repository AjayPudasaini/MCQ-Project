/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodeinbinarytree;

import java.util.*;

/**
 *
 * @author Ajay
 */
public class NodeinBinaryTree {
    
    static class Node
    {
        int a;
        Node left, right;
    }
    
    static Node newNode(int data)
            {
              Node t = new Node();
              t.a = data;
              t.left = null;
              t.right = null;
              
              return t;
            }
    
    static Node insert(Node root, int a)  
{  
     
    Node newnode = newNode(a);  
    Node x = root;  
    
    Node y = null;  
    
    while (x != null) {  
        y = x;  
        if (a < x.a)  
            x = x.left;  
        else
            x = x.right;  
    }  
      
    if (y == null)  
        y = newnode;  
     
    else if (a < y.a)  
        y.left = newnode;  
    

    else
        y.right = newnode;  
    
    return y;  
}  
     
static void Inorder(Node root)  
{  
    if (root == null)  
        return;  
    else {  
        Inorder(root.left);  
        System.out.print( root.a +" ");  
        Inorder(root.right);  
    }  
} 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Node root = null;  
         root = insert(root, 10);  
         insert(root, 7);  
         insert(root, 1);  
         insert(root, 15);  
         insert(root, 18);  
         insert(root, 6);  
         insert(root, 17);    

        
         Inorder(root); 
        
        
    }
    
}
