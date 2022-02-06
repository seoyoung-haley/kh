package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 => ");
		int income = sc.nextInt();
		
		if(income < 100 && income > 1) {
			
		
			String nType = (income % 2 != 0) ? "2의 배수가 아닙니다." : "2의 배수입니다.";
		
			System.out.println(nType);
		}
		
		
		
	}

}
