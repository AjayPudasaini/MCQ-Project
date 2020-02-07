/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearchrecursion;
import java.util.Scanner;
/**
 *
 * @author Ajay
 */
public class Linearsearchrecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 10 integer values: ");
        int input[] = new int[10];
        for (int j = 0; j < 10; j++)
        {
            input[j] = sc.nextInt();
        }
        
        int Search;
        System.out.println("Enter the value to search: ");
        Search = sc.nextInt();
        
        int index = LinearSearch(input, 0, input.length-1, Search);
        
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
