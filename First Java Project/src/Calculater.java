import java.util.*;
public class Calculater {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char operation;
		int num1;
		int num2;

		num1 = input.nextInt();

		operation = input.next().charAt(0);

		num2 = input.nextInt();
		
		input.close();

		if (operation == '+') {
			System.out.print(num1 + num2);
		}
		
		if (operation == '-') {
			System.out.print(num1 - num2);
		}
		
		if (operation == '*') {
			System.out.print(num1 * num2);
		}
		
		if (operation == '/') {
			System.out.print(num1 / num2);
		}
		
		else {
			System.out.print("Wrong operation");
		}
	}

}
