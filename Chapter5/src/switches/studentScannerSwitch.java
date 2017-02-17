/**
 * 
 */
package switches;
import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * @author ip133225
 *
 */
public class studentScannerSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int studentNumber;

		String studentString;
	
		//Scanner input = new Scanner(System.in);
	
		// System.out.print("Please enter your student ID >>>>> ");
		//user = input.nextInt();
		studentString = (String)JOptionPane.showInputDialog(null, "Please scan the student ID >>>>>", "Enter USer ID #",
	JOptionPane.QUESTION_MESSAGE, null,null,"");
		studentNumber = Integer.parseInt(studentString);
		
		if (studentNumber >= 100000 || studentNumber <= 4000000)
		{
			switch(studentNumber)
			{
			//collect everyones book distract scanner number or students is
			case 274896:
				JOptionPane.showMessageDialog(null, "Andrew Mckenzie Java Book, he is in the 10th grade. ");
				break; 
			case 274885:
				JOptionPane.showMessageDialog(null, "Charles Carlstrom ");
				break; 
			case 316282:
				JOptionPane.showMessageDialog(null, "Ress Alzahrani ");
				break; 
			case 274884:
				JOptionPane.showMessageDialog(null, "Tatyana Vaughn ");
				break; 
			case 133778:
				JOptionPane.showMessageDialog(null, "Nick Hasson ");
				break; 
			case 131457:
				JOptionPane.showMessageDialog(null, "Kassie Remley ");
				break; 
			case 137412:
				JOptionPane.showMessageDialog(null, "Sebastian Frick ");
				break; 
			case 131147:
				JOptionPane.showMessageDialog(null, "Zach Dorris ");
				break; 
			case 274887:
				JOptionPane.showMessageDialog(null, "Chase Kress ");
				break; 
			case 133225:
				JOptionPane.showMessageDialog(null, "Isaiah Ponciano ");
				break; 
			case 137428:
				JOptionPane.showMessageDialog(null, "Mason Hancock ");
				break; 
			case 122552:
				JOptionPane.showMessageDialog(null, "Computer located in room 161 John Brosius" );
				break; 
			case 133128083:
				JOptionPane.showMessageDialog(null, "Thats a random disk on Mr. Brosius desk");
				break; 
			default:
				JOptionPane.showMessageDialog(null, "That inividual Does not exist");
				}
			}
	else
		{	
				JOptionPane.showMessageDialog(null, "This number is way to high!");
		}
	}
}
