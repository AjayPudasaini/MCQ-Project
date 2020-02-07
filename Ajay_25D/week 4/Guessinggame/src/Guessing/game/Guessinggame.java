/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guessing.game;
import java.util.Scanner;

/**
 *
 * @author Ajay
 */
public class Guessinggame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           System.out.println("Any number between 1-20,000.");
        
        int max = 20000;
        int min = 1;
        int mid = (max + min)/2;
        
        Guessgaming(mid);
    }
    
    public static void Guessgaming(int middle_value)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Is this the number " + middle_value +" ?(Y/N)");
            String truth = sc.nextLine();
            if(truth.equals("Y") || truth.equals("y"))
            {
                break;
            }
            
            System.out.println("Is your guess is less than " + middle_value + "?(Y/N)");
            truth = sc.nextLine();

            if(truth.equals("Y") || truth.equals("y"))
            {
                if(middle_value == middle_value/2) 
                break;
                    middle_value = middle_value/2;
            }
            if(truth.equals("N") || truth.equals("n"))
            {
                if(middle_value == middle_value + middle_value/2) 
                break;
                    middle_value += middle_value/2;
            }
        }
        System.out.println("The guess number was: "+middle_value);
    }
}
   
    

