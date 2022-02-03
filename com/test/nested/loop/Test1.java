package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 ex = new Test1();
		ex.test();
	}

//	1. 정수하나 입력받아 -> 스캐너
//	2. 그 수가 양수일때만 입력된 수를 행 수로 적용하여 -> <0 , if문? 
//	3. 다음과 같이 출력되게 하는 프로그
//									-> for문
//	정수 하나 입력 :5
//	1
//	12
//	123
//	1234
//	12345

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int income = sc.nextInt();

		if (income > 0) {
			for (int i = 1; i <= income; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}
}