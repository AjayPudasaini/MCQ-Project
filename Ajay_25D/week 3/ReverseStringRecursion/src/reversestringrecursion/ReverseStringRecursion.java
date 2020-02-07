/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestringrecursion;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ReverseStringRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a word");
        word = sc.next();
        
        String rev = reverseString(word);
        
        System.out.println("The reverse is " + rev);
    }
    
    public static String reverseString(String words)
    {    
        if(words==null || words.length()<=1)
        {
            return words;
        }
        
        return reverseString(words.substring(1)) + words.charAt(0);       
    }
}

    
