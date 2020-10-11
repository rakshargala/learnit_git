
import java.util.Scanner;

   public class MySweetProgram {
	
	 public static void main(String[] args) {

					
	int a = 5;
	int b = 8;
	int addition = a + b;
	int subtraction = b - a;
	int multiplication = a * b;
	int division = b / a;
	int modulus = b % a;
	System.out.println("Addition of a and b is " +addition);
	System.out.println("Subtraction of a and b is " +subtraction);
	System.out.println("Multiplication of a and b is " +multiplication);
	System.out.println("Division of a and b is " +division);
	System.out.println("Remainder of a and b is " +modulus);
	
	
	a+=b;
	System.out.println("Updated value of a is " +a);
	
	b*=b;
	System.out.println("Updated value of b is " +b);
	
	
	
	int x = 9;
	int y = 8;
	int z = 20;
	
	if(x > y && y >= z)
	{
		System.out.println("x and y are greater than z");
	}
		
	else if(x >= y || y > z)
		{
			
			System.out.println("Either x or y is greater than z");
			
		}
	
		else
		{
		 
		System.out.println("z is greater"); 
		
		}
	
	
	
	
	
	int i;
	for(i = 0; i <= 9; i++)
	 {
	   System.out.println(i);
	 }
	
	
	
	
	
	//Ternary Operator
	int r = 30;
	int g = 98;
	int c = (r > g)? 420:520;
	System.out.println(c);
	
	
	
	//Bitwise Operator
	int j = 5;
	int k = 12;
	int l, u, v;
	l = j ^ k;
	u = ~ j;
	v = j >> 3;
	System.out.println(l);
	System.out.println(u);
	System.out.println(v);

	
  }
}
