import java.util.*;

class DivisionOfStudent{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		
		int marks;
		String div = "Null";
		
		System.out.print("Enter your marks: ");
		marks = input.nextInt();

		if (marks >= 75){
			div = "Distinction";
		}
		else if (marks >= 60){
			div = "First Division";
		}
		else if (marks >= 50){
			div = "Second Division";
		}
		else if (marks >= 33){
			div = "Third Division";
		}
		
		System.out.print("Your Division: "+div);
		
		input.close();
	}
}
