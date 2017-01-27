/**
 * 
 */
package arithmetic;
import java.util.Scanner; 
/**
 * @author IP133225
 *
 */
public class ArithmeticDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber;
		int secondNumber;
		int sum;
		int difference;
		int average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an interger >> ");
		firstNumber = input.nextInt();
		
		System.out.print("Please enter another interger >> ");  
		secondNumber = input.nextInt();
		
		sum = firstNumber + secondNumber; 
		difference = firstNumber - secondNumber;
		average = sum /2;
		
		System.out.println(firstNumber + " + " + secondNumber + " = " + sum );
		System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
		System.out.println(" The avarage of " + firstNumber + " and " + secondNumber + " is " + average); 
		
	}

}
