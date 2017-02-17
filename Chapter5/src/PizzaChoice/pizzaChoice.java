

package PizzaChoice;
import java.util.Scanner;

public class pizzaChoice
{


	public static void main(String[] args)
	{
		
		String choiceYes; //user is selecting that they have made a choice 
		String size;
		String pizzaKind = null;
		double smallCost = 6.99;
		double mediumCost = 9.99;
		double largeCost = 12.99;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Would you like a pizza? Yes or No>>>>>>");
		choiceYes = input.nextLine();
		//if you want pizza or not
		
		if("Yes".equals(choiceYes) || "yes".equals(choiceYes) || "Y".equals(choiceYes))
		{
				System.out.print("You said " + choiceYes + " to have a pizza.");
			    System.out.print("Please choose a size, small, medium, or large>>>>");
			    size = input.nextLine();//user determines size of pizza
			    if("small".equals(size) || "medium".equals(size)|| "large".equals(size))
			    {
			    System.out.print("You said " + size + " pizza size.");
			    System.out.print("What kind of pizza do you want? Pepperoni, Sausage, and or Cheese?>>>>");
			    pizzaKind = input.nextLine();
				    if("Pepperoni".equals(pizzaKind) || "Sausage".equals(pizzaKind) || "Cheese".equals(pizzaKind))
				    //pizza kind nested 
				    {
				    System.out.print("You said " + pizzaKind + "that sounds delicous");
				    System.out.print("You order consists of " + size + "pizza, with the topping of " + pizzaKind);
				    }
				   
				    if("small".equals(size))
				    	//the next size
				    {
				    	System.out.println("The cost of your pizza is $" + smallCost);
				    }
				    
				    if("medium".equals(size))
				    	//the next size
				    {
				    	System.out.println("The cost of your pizza is $" + mediumCost);
				    }	
				    if("large".equals(size))
				    	//the next size
				    {
				    	System.out.println("The cost of your pizza is $" + largeCost);
				    	
				    }
			    }
		    }
	}
	

}
