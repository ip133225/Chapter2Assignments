/**
 * 
 */
package taco;

import java.util.Scanner;

/**
 * @author IP133225
 *
 */
public class DelgadosChoice {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
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
		double orderNumber;
		
		menu();
		
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("Welcome to Delgados Tacos, How may we help you today?");
		System.out.println("Please order from our extensive menu from above with the coresponding number.");
		System.out.println("Which number are you going to pick? >>>>>");
		orderNumber = inputDevice.nextDouble();
		
		if (orderNumber == 1)
		{
			System.out.println("How many pop do you want?>>>>");
			popOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (popOrdered * popPrice);
			System.out.println("How you ordered " + popOrdered + "Pop, " + totalPrice);
		}
		if (orderNumber == 2)
		{
			System.out.println("How many tacos do you want?>>>>");
			tacoOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (tacoOrdered * tacoPrice);
			System.out.println("How you ordered " + tacoOrdered + "taco, " + totalPrice);
		}
		if (orderNumber == 3)
		{
			System.out.println("How many tamales do you want?>>>>");
			tamaleOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (tamaleOrdered * tamalesPrice);
			System.out.println("How you ordered " + tamaleOrdered + "tamales, " + totalPrice);
		}
		if (orderNumber == 4)
		{
			System.out.println("How many burrito do you want?>>>>");
			burritoOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (burritoOrdered * burritoPrice);
			System.out.println("How you ordered " + burritoOrdered + "burrito, " + totalPrice);
		}
		if (orderNumber == 5)
		{
			System.out.println("How many  nacho do you want?>>>>");
			 nachoOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice =  (nachoOrdered *  nachoPrice);
			System.out.println("How you ordered " +  nachoOrdered + "nacho, " + totalPrice);
		}
		if (orderNumber == 6)
		{
			System.out.println("How many enchilada do you want?>>>>");
			enchiladaOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (enchiladaOrdered * EnchiladaPrice);
			System.out.println("How you ordered " + enchiladaOrdered + "enchilada, " + totalPrice);
		}
		if (orderNumber == 7)
		{
			System.out.println("How many chickenAndCornChilaquile do you want?>>>>");
			chickenAndCornChilaquileOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (chickenAndCornChilaquileOrdered * ChickenAndCornChilaquilesPrice);
			System.out.println("How you ordered " + chickenAndCornChilaquileOrdered + "chickenAndCornChilaquile, " + totalPrice);
		}
		if (orderNumber == 8)
		{
			System.out.println("How many fajita do you want?>>>>");
			fajitaOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (fajitaOrdered * FajitaPrice);
			System.out.println("How you ordered " + fajitaOrdered + "fajita, " + totalPrice);
		}
		if (orderNumber == 9)
		{
			System.out.println("How many burritoBowlSoup do you want?>>>>");
			burritoBowlSoupOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (burritoBowlSoupOrdered * BurritoBowlSoupEnchiladaPrice);
			System.out.println("How you ordered " + burritoBowlSoupOrdered + "burritoBowlSoup, " + totalPrice);
		}
		if (orderNumber == 10)
		{
			System.out.println("How many cheesyBeefQuesadilla do you want?>>>>");
			cheesyBeefQuesadillaOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (cheesyBeefQuesadillaOrdered * CheesyBeefQuesadillaPrice);
			System.out.println("How you ordered " + cheesyBeefQuesadillaOrdered + "cheesyBeefQuesadilla, " + totalPrice);
		}
	}
		public static void menu()
		{
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("***********************************************");
			System.out.println("			1 Pop Price 0.99 "); 
			System.out.println("			2 Taco Price 0.99");
			System.out.println("			3 Tamale Price 0.99"); 
			System.out.println("			4 Burrito Price 1.99");
			System.out.println("			5 Nacho Price 1.99");  
			System.out.println("			6 Enchilada Price 2.99"); 
			System.out.println(" 			7 Chicken And Corn Chilaquiles Price 2.99"); 
			System.out.println("			8 Fajita Price 2.99 "); 
			System.out.println("			9 Burrito Bowl Soup Price 2.99"); 
			System.out.println("            10 Cheesy Beef Quesadilla 3.99"); 
			System.out.println("***********************************************");
			System.out.println();
			//the rest of my menu goes here.
		}
	}


