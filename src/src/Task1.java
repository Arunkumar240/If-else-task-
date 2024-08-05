package src;
//

//import java.util.Scanner;

import java.util.Scanner;

//minimum numbers

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int num1 = input.nextInt();
		System.out.print("Enter num2 : ");
		int num2 = input.nextInt();
		if (num1 < num2)
			System.out.println("The Minimum Number is :" + num1);
		
	else if (num1 > num2)
		System.out.println("The Minimum Number is :" + num2);
	else
		System.out.println("both the values are same :" + num1);

}
}