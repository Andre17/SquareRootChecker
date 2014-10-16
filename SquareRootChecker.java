/**
*
* Prompts user to enter a value, checks if negative -- if not, prints out the square root
*
* @author <AndrePurits>
* @version <8th October 2014>
*
*/
import java.util.Scanner;
public class SquareRootChecker {
	
	public static void main(String[] args) {
   Scanner scnr = new Scanner(System.in);
   System.out.println("Choose a value.");
   double value = scnr.nextDouble();
   if (value >= 0) {
   System.out.println("The square root of the given value is " + Math.sqrt(value) + ".");
   } else { 
   System.out.println("The square root of the given value is a nonreal answer.");
   }

   return;
   }
}

	


