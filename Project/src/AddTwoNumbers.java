import java.util.Scanner;
public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, sum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		num2 = sc.nextInt();
		
		sc.close();
		sum =  num1 + num2;
		System.out.println("Sum of these numbers: ");
		

	}

}
