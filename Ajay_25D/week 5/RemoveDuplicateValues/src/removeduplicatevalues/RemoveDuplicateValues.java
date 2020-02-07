/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeduplicatevalues;

/**
 *
 * @author A Plus
 */
import java.util.HashSet;
public class RemoveDuplicateValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array={5,8,3,6,7,5,8,3};
      
        deleteDuplicates(array);
    }
    public static void deleteDuplicates(int []myarr)
    {
        HashSet<Integer>hset=new HashSet<>();
        for(int i=0;i<myarr.length;i++)
        {
            hset.add(myarr[i]);
        }
        for(int num:hset)
        {
            System.out.println( num +" ");
        }

    }
}
