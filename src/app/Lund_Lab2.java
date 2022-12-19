package app;
/**
 * Edited By: Alec Lund
 * Edited on: 1/28/20
 * Description: The program below contains many potential unhandled exceptions and errors to showcase
 * how certains types of exceptions should be handled and what happens when these exceptions aren't handled at
 * all.
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException; 

public class Lund_Lab2
{

   public static final int SIZE = 4; //try changing to smaller than 5 (what new errors might you see?)
   public static void main(String[] args)
   {
      double[] data;                      
      int index;
      data = new double[SIZE]; 
      index = 0;
      
      try(Scanner input = new Scanner(new File("input.txt")))
      {
         while(input.hasNext())                   
         {
            data[index] = input.nextDouble(); 
            System.out.println(data[index]);
            index++;
         }
      }
      catch(FileNotFoundException e)
      {
         System.out.println(e.getMessage());
      }
      catch(InputMismatchException e)
      {
         System.out.println("A non-numrerical data type was found. Please remove it to continue.");
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         System.out.println("Index out of bounds. Change the size to match the number of numbers present in input.txt");
      }
   }   
}
