/**
 * 
 */
package review;
import java.util.Scanner;
/**
 * @author IP133225
 *
 */
public class EnterSmallValuse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int userEntry;
		  final int LIMIT = 3;
		  Scanner input = new Scanner(System.in);
		  System.out.print("Please enter a integer no higher than " +
			 LIMIT + " > ");
		  userEntry = input.nextInt();
		  while(userEntry > LIMIT)
		  {
			  System.out.println("The number you entered was way to high ");
			  System.out.print("Please enter an integer no higher than " + LIMIT +" > ");
			  userEntry = input.nextInt();
		  }
		  System.out.println("You correctly entered " + userEntry);
	}

}
