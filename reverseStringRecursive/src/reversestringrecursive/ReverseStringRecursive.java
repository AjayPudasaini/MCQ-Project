/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestringrecursive;
import java.util.Scanner;

/**
 *
 * @author Ajay
 */
public class ReverseStringRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a String: ");
        input = sc.next();
        
        String rev = reverseString(input);
        
        System.out.println("The reverse is " + rev);
    }
    public static String reverseString(String inputs)
    {    
        if(inputs==null || inputs.length()<=1)
        {
            return inputs;
        }
        
        return reverseString(inputs.substring(1)) + inputs.charAt(0);       
    }
    
}
