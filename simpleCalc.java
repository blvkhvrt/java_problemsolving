package Java1;

import java.util.Scanner;

public class simpleCalc {
	public static void main(String [] args) {
		
		
    Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the first number:");
	double firstNumber = scanner.nextInt();
	System.out.println("Enter the second number:");
	double secondNumber = scanner.nextInt();
	
	scanner.close();
	
	double sum = firstNumber / secondNumber;
	System.out.println("The division of 2 integers are: " + sum);
	}
}
 