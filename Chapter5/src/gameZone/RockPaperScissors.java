/**
 * 
 */
package gameZone;
import java.util.Random;

import javax.swing.JOptionPane;
/**
 * @author IP133225
 *
 */
public class RockPaperScissors {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int user;
		int computer;
		String msg = null;
		final int LOW = 0;
		final int HIGH = 2;
		Random r = new Random();
		computer = r.nextInt(2);
		
		user = Integer.parseInt(JOptionPane.showInputDialog(null, "Type the following numbers \n0 for Rock \n1 for Paper \n2 for Scissors "));
		//tie
		if((user == 0 && computer == 0) || (user == 1 && computer == 1)|| (user == 2 && computer == 2))
		{
			JOptionPane.showMessageDialog(null,  "Tie"); 
		}		
		//rock
		if((user == 1 && computer == 2) || (user == 2 && computer == 3) || (user == 1 && computer == 3))
		{
			JOptionPane.showMessageDialog(null,  "Rock, computer wins"); 
		}
		//paper
		if((user == 2 && computer == 1) ||(user == 3 && computer == 2) ||(user == 1 && computer == 2))
		{
			JOptionPane.showMessageDialog(null,  "Paper, computer wins"); 		
		}
		//scissors
		if((user == 3 && computer == 1)|| (user == 3 && computer == 2)||(user == 2 && computer == 1))
		{
			JOptionPane.showMessageDialog(null,  "Scissors, human wins"); 		
		}
		
	}

}
