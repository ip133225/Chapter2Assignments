/**
 * 
 */
package page80;
import java.util.Scanner; 
/**
 * @author IP133225
 *
 */
public class GetUserInfo
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String name; 
		int age; 
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter your name >>>>>");
		name = inputDevice.nextLine();
		System.out.print("Please enter your age >>>>>");
		age = inputDevice.nextInt();
		System.out.println("Your name is " + name + 
				" and your are " + age + " years old.");
	}

}
