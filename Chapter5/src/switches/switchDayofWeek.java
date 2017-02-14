/**
 * 
 */
package switches;
import java.util.Scanner;
/**
 * @author ip133225
 *
 */
public class switchDayofWeek
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a day during the week for your schedule? >>>> ");
		day = input.nextLine();
		switch(day)
		{
			case "Monday":
				System.out.print("Reserve room for meeting Friday.");
				break;
			case "Tuesday":
			case "tuesday":
				System.out.print("Meeting with Principa your fired.");
				break;
			default:
			System.out.print("That day does not exist to the known realm.");
			
			case "Wednesday":
			System.out.print("Remember D&D Thursday night call to confirm.");
			break;
			
			case "Thursday":
			System.out.print("Order snacks for delivery.");
			break;
			
			case "Friday":
			System.out.print("Meeting at 10 am.");
			break;
			
			case "Saturday":
			
			case "Sunday":
			System.out.print("It is time to go to church.");
			break;
		}
	}

}
