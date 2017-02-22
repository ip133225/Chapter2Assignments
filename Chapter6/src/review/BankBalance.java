/**
 * 
 */
package review;
import java.util.Scanner;
/**
 * @author IP133225
 *
 */
public class BankBalance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance;
			int response;
			int year = 1;
			final double INT_RATE = 0.03;
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter inital bank balance > ");
			balance = keyboard.nextDouble();
			System.out.println("Do you want to see next year's balance?");
			System.out.print("Enter 1 for a yes");
			System.out.print("	or any other number for no >> ");
			response = keyboard.nextInt();
			while(response == 1)
			{
				balance = balance + balance * INT_RATE;
				System.out.print("After year " + year + " at " + INT_RATE + " interest rate, balance is $" + balance);
				++year; //year = year + 1;
				System.out.println("\nDo you want to see the balance at the end of another year?");
				System.out.println(" Enter 1 for yes, or any other number for no>>>>");
				response = keyboard.nextInt();
			}
	}

}
