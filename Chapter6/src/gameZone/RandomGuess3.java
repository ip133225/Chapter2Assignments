/**
 * 
 */
package gameZone;

import javax.swing.JOptionPane;

/**
 * @author IP133225
 *
 */
public class RandomGuess3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guess= 0;
		 int result;
		 String msg = null;
		 final int LOW = 1;
		 final int HIGH = 10;
		 int counter = 0;
		 
		 result = LOW + (int) (Math.random() * HIGH);
		 while(result != guess)
		 {
			 guess = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Try to guess my number between " + LOW + " and " + HIGH));
			 if(guess == result)
				 msg = "\nRight!";
			 else
				 if(guess < result)
					 msg = "\nYour number was to low";
				 else
					 msg = "\nYour number was to high";
			 ++counter;
		 }
		 JOptionPane.showMessageDialog(null, "The number is " + result + msg + "in this many attempts " + counter);
	}

}
