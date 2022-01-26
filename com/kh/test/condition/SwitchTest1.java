package com.kh.test.condition;

import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		SwitchTest1 ss = new SwitchTest1();
		ss.test();
	} 
	
	public void test() {

		//메뉴 출력
		String menu = "-----------menu----------\n"
				+ "1. 가정용 (50원/liter)\n"
				+ "2. 상업용 (45원/liter)\n"
				+ "3. 공업용 (30원/liter)\n"
				+ "-------------------------";
		
		System.out.println(menu);						
		
//		사용자 입력
		Scanner sc = new Scanner(System.in);

		System.out.printf("메뉴 번호를 선택하세요. ==> ");
		int choice =sc.nextInt();
		
		System.out.printf("물 사용량을 선택하세요. ==> ");
		int wused =sc.nextInt();

//		결과값 출력
		
		
		System.out.println("----------<<수도세>>-----------");

		String choiceName = " ";
		int price = 0;
		
		switch(choice) {
		case 1:
			choiceName = "1. 가정용(집에서 사용하실 경우)";
			price = 50;
			break;

		case 2:
			choiceName = "2. 상업용(업소에서 사용하실 경우)";
			price = 45;
			break;

		case 3:
			choiceName = "3. 공업용(공장에서 사용하실 경우)";
			price = 30;			
			break;
			default :
				System.out.println("메뉴번호는 1,2,3만 가능합니다.");
		}
		
		int usedpay = price * wused;
		int waterpay = usedpay / 20;
		
		
		System.out.printf("선택메뉴번호 : %s를 선택하셨습니다.%n" , choiceName); 
		System.out.printf("사용요금 : %d%n" , usedpay); 
		System.out.printf("수도세 : %d%n" , waterpay);
		System.out.printf("총 수도요금 : %d%n" , usedpay + waterpay);
		
		
	}
	
	
}
