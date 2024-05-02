/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathprogam;
import java.util.Arrays;
/**
 *
 * @author VuyoMthembu
 */
public class MathProgamWithArray
{

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) 
    {
        //Declaring our Array
        int[] number = {3, 6, 9, 12, 15, 30};  
        
        try 
        {
            findFactor(number);
        } 
        catch (IllegalArgumentException e1) 
        {
            System.out.println("Exception caught: " + e1.getMessage());
        }
    }

    //Method void
    public static void findFactor(int[] number) 
    {
        if (number == null || number.length < 2) 
        {
            throw new IllegalArgumentException("Array must contain at least 2 numbers");
        }

        int num1 = number[0];
        int num2 = number[1];

        int commonFactor = findCommonFactor(num1, num2);

        if (commonFactor == 1) 
        {
            System.out.println("No common factor found.");
        } 
        else 
        {
            System.out.println("Common factor found: " + commonFactor);
        }

        //Array being reduce and checking for %
        int[] reducedArray = Arrays.stream(number)
                                   .filter(n -> n % commonFactor != 0)
                                   .toArray();

        System.out.println("Reduced array: " + Arrays.toString(reducedArray));
    }

    //Method int 
    public static int findCommonFactor(int num1, int num2) 
    {
        while (num2 != 0) 
        {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    
    
}
