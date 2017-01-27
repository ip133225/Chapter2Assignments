package IntergerDemo;
import java.util.Scanner;
   //IP133225

public class IntergerDemo {
	   
	  public static void main(String[] args) 
	  {  
	   
		  int anInt;
		  byte aByte;
		  short aShort; 
		  long aLong;
		  double anotherInt;

				
		  Scanner input = new Scanner(System.in);
		  
		  System.out.print("Please enter an interger >>>");
		  anInt = input.nextInt(); 
		  
		  System.out.print("Please enter a Byte  >>>");
		  aByte = input.nextByte(); 
		  
		  System.out.print("Please enter a short >>>");
		  aShort = input.nextShort();
		  
		  System.out.print("Please eneter a long >>>");
		  aLong = input.nextLong();
				  
		  System.out.println("The int is " + anInt);//1234
		  System.out.println("The byte is " + aByte);//12
		  System.out.println("The short is " + aShort);//12345
		  System.out.println("The long is " + aLong);//1234567890987654321
		
	}

}
