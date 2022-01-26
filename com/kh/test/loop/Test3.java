package com.kh.test.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 num = new Test3();
		num.test();
	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 9 까지의 정수를 입력해주세요 => ");
		int number = sc.nextInt();
		
//		System.out.printf("입력 받은 정수는 %d입니다.%n" , number);

		if(number>=1 && number<=9) {
		
			for (int i = 1 ; i<=9 ; i++) {
			
				System.out.printf("%d X %d = %d%n" , number, i, number * i);			
			}
			
		}else{
			
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}				
	}
}
