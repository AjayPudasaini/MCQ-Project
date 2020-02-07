/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearchrecursion;

import java.util.Scanner;

/**
 *
 * @author A plus
 */
public class Linearsearchrecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any 6 integer values: ");
        int array1[] = new int[6];
        for (int j = 0; j < 6; j++)
        {
            array1[j] = sc.nextInt();
        }
        
        int Search;
        System.out.println("Enter the value to search: ");
        Search = sc.nextInt();
        
        int index = LinearSearch(array1, 0, array1.length-1, Search);
        
        if (index != -1)
        {
           System.out.println("Element " + Search + " is present at index " +index); 
        }
        else
        {
            System.out.println("Element " + Search+ " is not present");
        }
    }
    
    public static int LinearSearch(int arr[], int a, int b, int search_value) 
    { 
          if (b < a)
          {
             return -1;
          }
          if (arr[a] == search_value)
          {
             return a;
          }
          if (arr[b] == search_value)
          {
             return b;
          }
          return LinearSearch(arr, a+1, b-1, search_value);
    }
}

        
    
    

