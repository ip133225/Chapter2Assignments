/**
 * 
 */
package randomguessmatch;

import java.util.Random;
import javax.swing.JOptionPane;
/**
 * @author IP133225
 *
 */
public class random {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Random r = new Random();
		final int LOW = 0;
		final int HIGH = 9;
		String msg;
		int result1 = r.nextInt(9);// result is random number generator integer used.
		int result2 = r.nextInt(9);
		int result3 = r.nextInt(9);
		//int result3 = r.nextInt(9);
		int userGuess1;
		int userGuess2;
		int userGuess3;
		//int userGuess3;
		userGuess1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess my number between " + LOW + "and" + HIGH));
		userGuess2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess my number between " + LOW + "and" + HIGH));
		userGuess3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess my number between " + LOW + "and" + HIGH));
		
		if(userGuess1 == result1 && userGuess2 == result2 && userGuess3 == result3)
		{ 
			msg = "You win a million dollars!";
		}
				
		if(userGuess1 == result1 && userGuess2 != result2 && userGuess3 != result3)//first number 
		{
			msg= "\n You got the first guess right";
		}
		if(userGuess1 != result1 && userGuess2 == result2 && userGuess3 != result3)//second number
		{
			msg= "\n You got the second guess right";
		}
		if(userGuess1 != result1 && userGuess2 != result2 && userGuess3 == result3)//third number
		{
			msg= "\n You got the third guess right";
		}
		else
			msg = "\n You're a loser get out of my Casino";
		
			JOptionPane.showMessageDialog(null, "The number are " + result1+ ", " + result2 + " and " + result3 +msg);
			
			
	}

}
