package src;

import java.util.Scanner;

public class three_maximun {

	public static void (String[] args) {
	   Scanner input=new Scanner (System.in);
		System.out.print("enter first number :");
        int num1=input.nextInt();
        System.out.print("enter the second number :");
        int num2=input.nextInt();
        System.out.print("enter the third number :");
        int num3=input.nextInt();
        if (num1<num2 || num2>num3 || num3>num1)
        System.out.print("the maximum number is :"+num1);
        else if (num1>num2 ||num2>num3)
        System.out.print("the maximum number is :"+num2);
        else 
        	System.out.print("the maximum number is :"+num3);
	}

}
