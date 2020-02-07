/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;
import java.util.Scanner;

/**
 *
 * @author Ajay
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String input = sc.nextLine();
               
        
        
        char[] rev = input.toCharArray();
        for(int i=rev.length-1; i>=0; i--)
        {
            System.out.println(rev[i]);
        }
    }
    
}
