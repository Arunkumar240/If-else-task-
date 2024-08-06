package src;

import java.util.Scanner;

public class class_sum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter the number : ");
		int n = input.nextInt();
		int sum = 0, a;
		for (int i = 1; i <=n; i++) {
			System.out.println("Enter the Number " + i + ": ");
			a = input.nextInt();
			sum += a;
		}
		System.out.println("The sum of given number is :" + sum);
		System.out.println("The Average of given number is :" + sum / n);

	}

}
