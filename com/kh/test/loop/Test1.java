package com.kh.test.loop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 study = new Test1();
		study.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 => ");
		int income = sc.nextInt();
		
		int sum = 0 ;		
				
		for (int i = 0; i <= income ; i += 2) {

			sum += i;

//		System.out.printf("i = %d, sum = %d%n", i, sum); //값 확인용
			}
		
		System.out.printf("1부터 입력 받은 정수 %d까지 존재하는 짝수의 합은 %d입니다." ,income, sum);
	}
}
