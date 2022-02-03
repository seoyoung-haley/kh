package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 ex = new Test2();
		ex.test();
	}

//정수하나 입력받아, 
//그 수가 양수일때만 입력된 수를  행수로 적용하여 
//다음과 같이 출력되게 하는 프로그램을 만들어보자.
//	
//	출력예)
//	정수 입력 : 5
//	*****
//	****
//	***
//	**
//	*



	public void test() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int income = sc.nextInt();
		
		if( income > 0) {
			for (int i = 1; i <= income; i++) {
				for (int j = income; j >= i; j--) {
//					System.out.print(i);
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}
}
