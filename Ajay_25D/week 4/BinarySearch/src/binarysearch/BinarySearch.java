/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myArray[] = {1,2,3,4,5,6,7,8,9};
        
        int searchvalue;
        System.out.println("Enter a value to search");
        searchvalue = sc.nextInt();
        bsearch(myArray, searchvalue);

        }   
    public static void bsearch(int[] arr, int val)
    {
        int  first = arr[0];
        int  last = arr.length-1;
        int mid;
        
        while(first<=last)
        {
            mid = (first + last)/2;
            
            if(val == arr[mid])
            {
                System.out.println("Number found at position " +(mid+1));
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