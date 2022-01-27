package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 study = new Test1();
//		study.test1();
		study.test2();

	}
	
//	1) 정수 한 개를 입력 받아, 1부터 입력 받은 정수까지의 홀수의 곱을 출력하세요.
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오 => ");
		int userNum = sc.nextInt();
		int i = 0;
		int sum = 1;
		
		while (i < userNum) {

			i++;
			
			if ( i % 2 != 0) {
				
				sum *= i; // -> sum = sum * i			
				
			} continue;			
			
		} System.out.printf("입력 받은 정수 %d 까지의 홀수의 곱은 %d입니다." , userNum , sum);
		
		
	}
	
	
	
	
//	2) 사용자로부터 정수를 두개 입력 받아서, 작은 정수에서 큰 정수까지 홀수의 합을 구하세요.
// 		Tip. 큰수/작은수에 해당하는 변수를 사용할 것.

	public void test2() {
		Scanner scn = new Scanner(System.in);
		System.out.println("정수를 하나 입력하세요 => ");
		int num1 = scn.nextInt();
		System.out.println("다른 정수를 하나 입력하세요 => ");
		int num2 = scn.nextInt();
		
		System.out.println("========================");

		int j ; //작은 정수
		int k;    //큰 정수
		int total = 0;

		if (num1 < num2) {
			
			j = num1;
			k = num2;
			
		} else {
			
			j = num2;
			k = num1;
		}

		while (true) {		
					
				if ( k % 2 != 0) {				
				total += k ; // -> sum = sum * i			
				
				} 	k--; 	
					if(j > k)
					break;	
				
		}System.out.printf("%d부터 %d까지의 홀수의 합은 %d이다." , num1 , num2 , total);
	}
}
