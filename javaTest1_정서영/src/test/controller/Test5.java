package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수 입력 => ");
		int number1 = sc.nextInt();
		System.out.println("두번째 정수 입력 => ");
		int number2 = sc.nextInt();
		

		if( (number1 > 0 && number1 < 10) && (number2 > 0 && number2 < 10) ) {			
			
			if( (number1 * number2) / 10 == 0 ) {
			
			System.out.println("한자리 수 입니다.");

			}else { 
			 System.out.println("두자리 수 입니다.");
		}
		}
		
	}

}
