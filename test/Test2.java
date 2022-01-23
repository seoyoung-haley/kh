package com.kh.test;

public class Test2 {

	public static void main(String[] args) {
		
		//신상정보 변수 생성
		String name = "정서영";
		int age = 31;
		char sex = '여';
		String address = "경기도 고양시";
		String phone = "01099604175";
		String email = "yaeinn@naver.com";

		//출력
		System.out.printf("%s, %d, %c , %s, %s, %s\n\n",name, age, sex, address, phone, email);

		
		System.out.println("=======================================================================");
		System.out.println("이름\t나이\t성별\t전화번호\t\t이메일\t\t주소");
		System.out.println("=======================================================================");
		
		//변수 재사용
		
		name = "홍길동";
		age = 22;
		sex = '남';
		phone = "01012341234";
		email = " ";
		address = "경기도 광주시";
		
		System.out.printf("%s\t%d\t%c\t%s\t\t%s\t%s\n",name, age, sex, phone, email, address);
		
		name = "홍길순";
		age = 20;
		sex = '여';
		phone = "010123412341";
		email = "hgd@naver.com";
		address = "전라남도 광주시";
		
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s",name, age, sex, phone, email, address);		
	}
	
	
}
