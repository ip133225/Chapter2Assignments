/**
 * 
 */
package eggs;

import javax.swing.JOptionPane;
/**
 * @author IP133225
 *Jan, 30th 2017
 */
public class eggs {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Number of eggs to buy and the amount left over
		String Answers;
		double dozenEggsCost = 3.25;
		double remainderEggCost = .45;
		int dozenEggs = 12;
		int remainderEgg;
		int numberOfDozenEggs;
		int totalOfEggsOrdered;
		double totalCost; 
		
		Answers = JOptionPane.showInputDialog(null, "How many eggs would you liKe Sir or Madam.", JOptionPane.QUESTION_MESSAGE);
		totalOfEggsOrdered = Integer.parseInt(Answers); 
		
		numberOfDozenEggs = totalOfEggsOrdered / dozenEggs; 
		remainderEgg = totalOfEggsOrdered % dozenEggs; 
		
		totalCost = numberOfDozenEggs * dozenEggsCost + remainderEggCost;  
		
		JOptionPane.showInputDialog(null, "You ordered " + totalOfEggsOrdered); 
		
		
		// TODO Auto-generated method stub

	}

}
