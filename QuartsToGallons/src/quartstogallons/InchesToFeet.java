/**
 * 
 */
package quartstogallons;

/**
 * @author IP133225
 *
 */
import javax.swing.JOptionPane;
public class InchesToFeet
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String answer;
		int inches;
		int inchesInFeet = 12;
		int inchesLeft;
		int feet;
		
		answer = JOptionPane.showInputDialog(null, "How many inches?", JOptionPane.QUESTION_MESSAGE);
		inches = Integer.parseInt(answer);
		
		
		feet = inches/inchesInFeet;
		inchesLeft = inches%inchesInFeet;
		
		JOptionPane.showMessageDialog(null, feet + " feet and " + inchesLeft + "inches");
		// TODO Auto-generated method stub

	}

}
