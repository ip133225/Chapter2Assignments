/**
 * 
 */
package switches;
import java.util.Scanner;
/**
 * @author ip133225
 *
 */
public class switchStatementAge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user;
		Scanner input = new Scanner(System.in);
		
		System.out.print("How old are you? >>>> ");
		user = input.nextInt();
		switch(user)
		{
			case 18:
				System.out.println("Your 18");
				break;
			case 19:
			case 20:
			case 21:
				System.out.println("Your between 19 and 21.");
				break;
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
				System.out.println("Your between 22 and 30.");
				break;
			default:
				System.out.println("No way you're that old.");
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
				System.out.println("Your between 31 and 35.");
				break;
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
				System.out.println("Your between 36 and 40.");
				break;
			case 41:
			case 42:
			case 43:
			case 44:
			case 45:
				System.out.println("Your between 41 and 45.");
				break;
			case 46:
			case 47:
			case 48:
			case 49:
			case 50:
				System.out.println("Your between 46 and 50.");
				break;
				
		}
	}

}
