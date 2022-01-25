package com.kh.test.condition;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Test4 oe = new Test4();
		oe.test();

	}
	
//	1~10 사이의 정수 한개를 입력받아 홀수인지 ->스캐너
//	단, 1~10사이의 정수가 아닌 경우 " 반드시 1~10사이의 정수를 입력해야 합니다."를 출력하세요.->if else
//  짝수인지 확인하고, 홀수면 "홀수다.", 짝수면 "짝수다."출력 하세요. 
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~10 사이의 정수 한개를 입력해주세요 : ");
		int user = sc.nextInt();
		
		if(user>=1 && user<=10) {

			if (user % 2 ==0) {
				System.out.printf("짝수");
			}else {
				System.out.println("홀수");
			}
			
		}else {
		System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
		}	
	}
}
