/**
 * 
 */
package quartstogallons;

import javax.swing.JOptionPane;

/**
 * @author IP133225
 *
 */
public class NauticalMiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
			double numKilo = 1.852;
			double convertNumKilo;
			double numOfMiles = 1.150779;
			double convertnumMiles;
			double inputNM;
			
			String NMString;
			
		NMString= JOptionPane.showInputDialog(null, "How many nautical miles did they run?", "Dialog 1", JOptionPane.INFORMATION_MESSAGE);
		inputNM = Double.parseDouble(NMString);
		
		convertNumKilo = numKilo * inputNM;
		convertnumMiles = numOfMiles * inputNM;
		
				
		System.out.println("The converting Nautical Miles of " + NMString + "to Kilometers is " + convertNumKilo);
		System.out.println("The converting Nautical Miles of " + NMString + "to Miles is " + convertnumMiles);
		// TODO Auto-generated method stub

	}

}
