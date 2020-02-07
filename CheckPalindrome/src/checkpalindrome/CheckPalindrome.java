/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpalindrome;
import java.util.Scanner;
/**
 *
 * @author Ajay
 */
public class CheckPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String input, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        input = s.nextLine();
        int n = input.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + input.charAt(i);
        }
        if(input.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
        
    }
    
}
