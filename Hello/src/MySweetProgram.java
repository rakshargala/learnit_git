
import java.util.Scanner;

   public class MySweetProgram {
	
	 public static void main(String[] args) {
		int result;			
		Scanner input = new  Scanner(System.in);
		
		System.out.println("Choose an operator: +, -, *, /: ");
		String operator = input.nextLine();
		
		System.out.println("Enter the 1st number: ");
		int number1 = input.nextInt();
		
		System.out.println("Enter the 2nd number: ");
		int number2 = input.nextInt();
		
		
		if (number1 > number2) {
		
		
		switch(operator) {
		
		case "+":
			result = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;
		
		case "-":
			result = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + result);	
			break;
		
			
			
		case "*":
			result = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = " + result);	
			break;
			
		case "/":
			result = number1 / number2;
			System.out.println(number1 + " / " + number2 + " = " + result);	
			break;
			
		default:
			System.out.println("Invalid operator");
			break;
				 }
		
				}	

		
		
		else
			System.out.println("number 2 is greater");
	
		
		
		input.close();
		
  }
}
