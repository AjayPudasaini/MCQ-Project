/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;
import java.util.Scanner;

/**
 *
 * @author Ajay
 */
public class Binarysearch {

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
//       Scanner sc = new Scanner(System.in);
//        int myArray[] = {1,2,3,4,5,6,7,8,9};
        
        int searchvalue;
        System.out.println("Enter a value to search");
        searchvalue = sc.nextInt();
        bsrch(input, searchvalue);
    }
     public static void bsrch(int[] arr, int val)
    {
        int  first = arr[0];
        int  last = arr.length-1;
        int mid;
        
        while(first<=last)
        {
            mid = (first + last)/2;
            
            if(val == arr[mid])
            {
                System.out.println("Number found at position " +(mid));
                break;
            }
            
            else if(val<arr[mid])
            {
                first = mid + 1;
            }
            
            else
            {
                last = mid - 1;
            }
            
            if(first > last)
            {
                System.out.println("Element not found");
            }
    }
    
}
}
