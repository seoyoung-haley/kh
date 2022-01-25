package com.kh.test.condition;

import java.util.Random;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Test6 rsp = new Test6();
		rsp.test();

	}
//승패를 결정함->입력 받은 값과 컴퓨터의 값을 비교하여 결과 냄->이때 컴퓨터 값은 랜덤 메소드 사용

	
	public void test () {

		System.out.println("===가위 바위 보 게임===");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 선택하세요 (1.가위 2.바위 3.보) :　" );		
		int user = sc.nextInt();
		String in = " ";
		String line = "=======　결과　========";
		
		System.out.println(line);
		
		if (user == 1) {
			in = "가위";
			
		}else if(user == 2) {
			in = "바위";
			
		}else {
			in = "보";			
		} 
		
		System.out.printf("당신은 %s를 냈습니다.%n",in);				
		
		Random out = new Random();
		int com = (out.nextInt(3) + 1);
		String str = " ";

		if (com == 1) {
			str = "가위";
			
		}else if(com == 2) {
			str = "바위";
			
		}else {
			str = "보";			
		} 
		
		System.out.printf("컴퓨터는 %s를 냈습니다.%n",str);				
		System.out.println(line);

		
		if(user==com) {		
			System.out.println("무승부! 다시 플레이 하세요!");
		}else if((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
				System.out.println("당신이 이겼습니다ㅠ.ㅠ");
			}else {
				System.out.println("컴퓨터가 이겼습니다^.< ");				
			}
						
	}
}
