package com.java.practiceQuestion;

import java.util.Scanner;

public class CalculateFactorial {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		scanner.close();
		FactorialPrint factorialPrint = new FactorialPrint();
		factorialPrint.printFactorialValue(number);
		

	}
}
