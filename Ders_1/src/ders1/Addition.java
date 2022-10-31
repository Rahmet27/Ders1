package ders1;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int sum;
		
		System.out.println("Enter first number: ");
		num1 = input.nextInt();
		
		System.out.println("Enter second number: ");
		num2 = input.nextInt();
		
		sum = num1 + num2;
		
		System.out.println("The sum of the two numbers is : "+sum);

	}

}
