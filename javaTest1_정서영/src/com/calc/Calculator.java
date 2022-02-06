package com.calc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int sum = num1 + num2;
		int minus = num1 - num2;
		int multiple = num1 * num2;
		int divide = num2 <= 0 ? 0 : num1 / num2;

		System.out.println("--- 결과 ---");
		System.out.println("합 : " + sum);
		System.out.println("차 : " + minus);
		System.out.println("곱 : " + multiple);
		System.out.println("나누기 : " + divide);
		
		
	}

}
