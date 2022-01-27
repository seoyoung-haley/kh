package com.kh.test.loop;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Test8 study = new Test8();
		study.test();

	}
//  분식집 주문 받는 프로그램을 만들어 보자
	
	public void test() {
//		사용자 입력
		Scanner sc = new Scanner(System.in);
		String menu = ("메뉴\n"
				+ "김밥류 ======================\n\n"
				+ "1.원조김밥 ===========1500원\n"
				+ "2.치즈김밥 ===========2000원\n"
				+ "3.참치김밥 ===========2300원\n\n"
				+ "라면류 ======================\n\n"
				+ "4.그냥라면 ===========3000원\n"
				+ "5.치즈라면 ===========3500원\n"
				+ "6.짬뽕라면 ===========4000원\n\n"
				+ "분식류 ======================\n\n"
				+ "7.떡볶이 ============2500원\n"
				+ "8.순대 =============2500원\n"
				+ "9.오뎅 =============1000원\n\n"
				+ "기타 =======================\n\n"
				+ "10.음료수 ==========1000원\n");
			
			System.out.println(menu);
			
			int foodPrice = 0; 
			int totalPrice = 0; //총 합계
			char yn = 'y';
			int foodNum;
			String foodName = "";
			int price = 0;
			String allChoice = "";
			
		do {			
			
			System.out.println("메뉴를 선택해주세요 => ");
			String foodChoice = sc.next();
			
			foodName = "";
			price = 0;
			
			switch(foodChoice) {
			case "1":
				foodName = "원조김밥";
				price = 1500;	
				break;
				
			case "2":
				foodName = "치즈김밥";
				price = 2000;	
				break;
				
			case "3":
				foodName = "참치김밥";
				price = 2300;	
				break;
				
			case "4":
				foodName = "그냥라면";
				price = 3000;	
				break;
				
			case "5":
				foodName = "치즈라면";
				price = 3500;	
				break;
				
			case "6":
				foodName = "짬뽕라면";
				price = 4000;	
				break;
				
			case "7":
				foodName = "떡볶이";
				price = 2500;	
				break;
				
			case "8":
				foodName = "순대";
				price = 2500;	
				break;
				
			case "9":
				foodName = "오뎅";
				price = 1000;	
				break;
				
			case "10":
				foodName = "음료수";
				price = 1000;	
				break;
				
			default: 
				System.out.println("잘못된 번호입니다.");
				continue; //다시 스위치문 반복	
			}
			
			
			
				System.out.println("수량을 선택해주세요 => ");
				foodNum = sc.nextInt();
				
				//메뉴의 수량별 합계
				foodPrice = foodNum * price;
			
				//토탈 합계 누적
				totalPrice += foodPrice;
				
				//결과 출력 정보 누적
				
				allChoice += (foodName + " : " +foodNum + "개 - " +foodPrice + "원\n");
				
				
				System.out.println("추가 주문을 하시겠습니까? (y/n) => ");
				yn = sc.next().charAt(0);

		// y 를 선택할 경우 다시 시작, 데이터는 누적
		} while (yn == 'y'); 
		
		System.out.println("주문하신 정보는 다음과 같습니다.\n" + "-------------------------\n");
		
		System.out.println(allChoice);
		System.out.println("-------------------------");
		System.out.printf("합계 : %d원" , totalPrice);
		}		
	
		// n 을 선택할 경우 주문결과서 출력
		
}

