import java.util.*;

class CLIadd{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);

		int num1, num2;
		
		System.out.print("Enter first number: ");
		num1 = input.nextInt();

		System.out.print("Enter second number: ");
		num2 = input.nextInt();

		int sum = num1 + num2;
		
		System.out.println("Sum = "+sum);

		input.close();
	}
}