/**
 * 
 */
package youDoIt;

import java.util .Scanner;



public class MythicalCountry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double hoursWorked;
		double rateOfPay = 0;
		double grossPay; 
		double netPay;
		double regularPay;
		double overtimePay;
		final int FULL_WEEK = 32;
		final double OT_RATE = 2 * rateOfPay;
		final double GovmentGetHalf = .5;
		double afterTax;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many hours did you work this week? ");
		hoursWorked = keyboard.nextDouble();
		System.out.print("What is your regular pay rate? ");
		rateOfPay = keyboard.nextDouble();
		if(hoursWorked > FULL_WEEK)
		{
			regularPay = FULL_WEEK * rateOfPay;
			overtimePay = (hoursWorked - FULL_WEEK) * OT_RATE * rateOfPay;
			afterTax = overtimePay * GovmentGetHalf;
		}
		else
		{
			regularPay = hoursWorked * rateOfPay;
			overtimePay = 0.0;
			afterTax = regularPay * GovmentGetHalf;
		}
		System.out.println("Regular pay is " +
				regularPay + "\nOvertime pay is " + overtimePay);
	}

}
