package com.java.practiceQuestion;

public class FactorialPrint {
	public int findFactorial(int n) {
		if(n==0) return 1;
		return n*findFactorial(n-1);
	}
	public void printFactorialValue(int number) {
		int factorial = new FactorialPrint().findFactorial(number);
		if(factorial==0) {
			System.out.println("Too long number!!!!!");
			//System.exit(0);
		}
		System.out.print(number+"! = ");
		
		for(int i=number;i>0;i--) {
			if(i==1) {
				System.out.print(i+" = "+factorial);
			}else
			System.out.print(i+" X ");
		}
	}
	public static void main(String[] args) {
		
	}

	

}
