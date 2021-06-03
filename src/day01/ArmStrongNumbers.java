package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmStrongNumbers {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter a number");
	int number = scan.nextInt();
	
	armStrongNumbers(number);
	
	scan.close();
	}
	public static void armStrongNumbers(int a) {
		try {
			String str = String.valueOf(a);
			String arr[]=str.split("");
			List<Integer> list = new ArrayList<>();
			for(int i = 0; i<arr.length; i++) {
				list.add(Integer.valueOf(arr[i]));
				}
			
			int sum = 0;
			for(int w:list ) {
				int b = w*w*w;
				sum += b;
				b=1;
			}
			System.out.println(sum);
			if (sum==a) {
				
				System.out.println(a+" is an armstrong number");
			}else {
				System.out.println(a+" is not an armstrong number");
			}
		}catch(NumberFormatException e) {
			System.out.println("Please try with positive numbers");
		}
	}

}
