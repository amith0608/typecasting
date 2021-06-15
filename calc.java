package calculator;

/**
 * 
 */
import java.util.Scanner;


/**
 * @author hp
 *
 */
public class calc 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int num1, num2, ch;
		System.out.println("Enter the 1st number\n");
		num1 = scan.nextInt();
		System.out.println("Enter the 2nd number\n");
		num2 = scan.nextInt();
		System.out.println("Enter the operation to perform");
			
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");15
		ch = scan.nextInt();
		
		System.out.println("Result=");
		
	switch(ch)
	{
	case 1: System.out.println(num1 + num2);
			break;
	case 2: System.out.println(num1 - num2);
			break;
	case 3: System.out.println(num1 * num2);
			break;
	case 4:	System.out.println(num1 / num2);
			break;
	default: System.out.println("Wrong option");
	}
	}	
}

