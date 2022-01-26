package com.kh.test.loop;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 num = new Test2();
		num.test();
	}

	public void test() {
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 => ");
		int number = sc.nextInt();		

		for(int i = 1; i<=number ; i++) {			
			
			String s = (i % 2 != 0) ? "수" : "박";
			System.out.printf("%s",s);
			
			
		}			
	}
}