package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
 
		Test1 ex = new Test1();
		ex.test();
		
	}

	public void test() {
		//사용자에게 입력받은 문자하나 -> 스캐너, char
		//문자타입에 따라 구분해 출력 -> " 입력하신 문자 1(유저입력) 은/는  숫자(출력)입니다"

		Scanner sc = new Scanner(System.in);
		System.out.println("문자 하나를 입력해주세요 : ");
		String temp = sc.next();
		char user = temp.charAt(0);
		String out = "특수문자";
		
		if ( (char)user>=48 && user<58 ) {
			out = "숫자";
		}
		else if ( (char)user>=97 && user<123  ){
			out = "알파벳 소문자";
		}
		else if ((char) user>=65 && user<91  ){
			out = "알파벳 대문자";
			
		}else if ((char) user>=65 && user<91  ){
			out = "알파벳 대문자";
			
		}else {
			
		}

		System.out.printf("입력하신 %s은/는 %s입니다.", user, out);
	}
}
