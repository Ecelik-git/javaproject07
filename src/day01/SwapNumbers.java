package day01;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 2 number space seperated: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("Before");
		System.out.println("First Number: "+num1);
		System.out.println("Second Number "+ num2);
		System.out.println();
		
		
		//1.way
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.println("After 1");
		System.out.println("First Number: "+num1);
		System.out.println("Second Number "+ num2);
		System.out.println();
		num3 = num2;
		num2 = num1;
		num1 = num3;
		
		
		//2. way
		num1 = num1 - num2;
		num2 = num2 + num1;
		num1= num2 - num1;
		System.out.println("After 2");
		System.out.println("First Number: "+num1);
		System.out.println("Second Number "+ num2);
		scan.close();

	}

}
