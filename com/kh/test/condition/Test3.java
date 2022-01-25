package com.kh.test.condition;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 cc = new Test3();
		cc.test();

	}
//		정수 두개를 입력 받고, 
//		연산자(+,-,*,/)를 입력받은 다음 계산한 뒤 결과를 출력하는

	public void test() {
//		입력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1을 입력하세요 : ");
		int num1 = sc.nextInt();
				
		System.out.println("정수2를 입력하세요 : ");
		int num2 = sc.nextInt();		

		System.out.println("연산자(+,-,*,/)를 입력하세요 : ");
		String temp = sc.next();
		char chr = temp.charAt(0);
		
		
		if (num1<0 || num2<0 || (chr!=42 && chr!=43 && chr!=45 && chr!=47)) {

			System.out.println("잘못 입력 하셨습니다. 프로그램을 종료합니다");			
			
		}else if(chr == '+'){
			System.out.printf("%d%s%d = %d", num1, chr, num2, num1+num2);
		}else if(chr == '-'){
			System.out.printf("%d%s%d = %d", num1, chr, num2, num1-num2);
		}else if(chr == '*'){
			System.out.printf("%d%s%d = %d", num1, chr, num2, num1*num2);
		}else if(chr == '/'){
			System.out.printf("%d%s%d = %.6f", num1, chr, num2, (double)num1/num2);
		}
		
	 }
}
