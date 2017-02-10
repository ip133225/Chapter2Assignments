
//Enter Your Age Program
 
	//Create a program that enters an age for a user.

package conditionalLogic;//Package is called conditionalLogic

import java.util.Scanner;

public class ageprogram 
{

	public static void main(String[] args) 
	{
		
		int age; // 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age? >>>>>");
		age = input.nextInt(); 
		if(age <= 18 )
			
		{
			System.out.println("User is less than 18.");
		}
		if(age >= 23 && age <= 30)
		{
			System.out.println("User is older than 18"); 
		}
		if(age > 31 && age < 50)
		{
			System.out.println("User is older than 18"); 
		}
		if(age > 66 && age < 100)
		{
			System.out.println("Time for kids, unless you hate kids.");
		}

	}
}
