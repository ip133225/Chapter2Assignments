/**
 * 
 */
package taco;

import java.util.Scanner;
/**
 * @author IP133225
 *
 */
public class tacoString 
{

	/**
	 * @param args
	 */
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		tacoTruck();
		menu();
		orderingMenu();
		
	}
	public static void orderingMenu()
	{

		String tacoString, burritoString;
		double popPrice = 0.99;
		double tacoPrice = 0.99;
		double tamalesPrice = 0.99;
		double burritoPrice = 1.99;
		double nachoPrice = 1.99;
		double EnchiladaPrice = 2.99;
		double ChickenAndCornChilaquilesPrice = 2.99;
		double FajitaPrice = 2.99;
		double BurritoBowlSoupEnchiladaPrice = 2.99;
		double CheesyBeefQuesadillaPrice = 3.99;
		double popOrdered;
		double tacoOrdered;
		double tamaleOrdered;
		double burritoOrdered;
		double nachoOrdered;
		double enchiladaOrdered;
		double chickenAndCornChilaquileOrdered;
		double fajitaOrdered;
		double burritoBowlSoupOrdered;
		double cheesyBeefQuesadillaOrdered;
		double totalPrice;
		double totalPriceWithTax;
		
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("How many pops do you want? >>>>>");
		popOrdered = inputDevice.nextDouble();
		inputDevice.nextLine(); 
		
		System.out.println("How many tacos do you want? >>>>>");
		tacoOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Tamales do you want? >>>>>");
		tamaleOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Burritos do you want? >>>>>");
		burritoOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Nachos do you want? >>>>>");
		nachoOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Enchiladas do you want? >>>>>");
		enchiladaOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Chicken And Corn Chilaquiles do you want? >>>>>");
		chickenAndCornChilaquileOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Fajitas do you want? >>>>>");
		fajitaOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Burrito Bowl Soups do you want? >>>>>");
		burritoBowlSoupOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many  Cheesy Beef Quesadillas do you want? >>>>>");
		 cheesyBeefQuesadillaOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		totalPrice = (popPrice * popOrdered) + (tacoPrice * tacoOrdered) + (tamalesPrice * tamaleOrdered) + (burritoOrdered * burritoPrice) + (nachoPrice * nachoOrdered) +	(EnchiladaPrice * enchiladaOrdered) + (ChickenAndCornChilaquilesPrice * chickenAndCornChilaquileOrdered) + (FajitaPrice * fajitaOrdered) + 	(BurritoBowlSoupEnchiladaPrice * burritoBowlSoupOrdered) + (CheesyBeefQuesadillaPrice * cheesyBeefQuesadillaOrdered);
		
		System.out.println(" How you ordered " + popOrdered + " Pops," + tacoOrdered + " Tacos, " + tamaleOrdered + " Tamales, " + burritoOrdered + " Burritos, " + nachoOrdered + " \rNachos, " + enchiladaOrdered + " Enchilada, " + chickenAndCornChilaquileOrdered + " Chicken And Corn Chilaquile, " + fajitaOrdered + " Fajita, " + burritoBowlSoupOrdered + " \rBurrito Bowl Soup, " +  cheesyBeefQuesadillaOrdered + " Cheesy Beef Quesadilla Ordered, for a total price of " + totalPrice);
				
	}
	public static void menu()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("***********************************************");
		System.out.println("			 Pop Price 0.99 "); 
		System.out.println("			 Taco Price 0.99");
		System.out.println("			 Tamale Price 0.99"); 
		System.out.println("			 Burrito Price 1.99");
		System.out.println("			 Nacho Price 1.99");  
		System.out.println("			 Enchilada Price 2.99"); 
		System.out.println(" 			 Chicken And Corn Chilaquiles Price 2.99"); 
		System.out.println("			 Fajita Price 2.99 "); 
		System.out.println("			 Burrito Bowl Soup Price 2.99"); 
		System.out.println("             Cheesy Beef Quesadilla 3.99"); 
		System.out.println("***********************************************");
		System.out.println();
		//the rest of my menu goes here.
	}
	public static void tacoTruck()
	{
		System.out.println("***********************************************");
		System.out.println("*                                             *");
		System.out.println("*     *******    *    ******  *******         *");
		System.out.println("*        *      * *   *       *     *         *");
		System.out.println("*        *     *****  *       *     *         *");
		System.out.println("*        *    *     * ******  *******         ***************");
		System.out.println("*                                             *          *   *");
		System.out.println("*                                             *          *    *");
		System.out.println("*                                             *          *******");
		System.out.println("*                                             *   ***            *");
		System.out.println("*                                             *                 *");
		System.out.println("*  *******                                    *      *******   *");
		System.out.println("***       *******************************************       ***");
		System.out.println("   *     *                                           *     *");
		System.out.println("   *******                                           *******");
	}
	

}

