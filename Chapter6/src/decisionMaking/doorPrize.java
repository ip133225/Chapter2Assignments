/**
 * 
 */
package decisionMaking;
import java.util.Scanner; 
/**
 * @author IP133225
 *
 */
public class doorPrize
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int choice;
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Choose what is behind Door #1, or Door #2, or Door #3");
		choice = inputDevice.nextInt();
		
		//door number one comment line
		if(choice == 1)
		{
			System.out.println("A brand new car!");
		}
		if(choice == 2)
		{
			System.out.println("A brand new huffy bike!");
		}
		if(choice == 3)
		{
			System.out.println("NOTHING YOU'RE A LOSER!!!");
		}
		
		//If choice is greater or equal to 4
		//print something to let the user know that there are only three doors
	}

}
