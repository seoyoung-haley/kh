package com.kh.test.condition;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 a = new Test5();
		a.test();

	}
//	키(cm)와 몸무게(kg)을 입력
	
//	BMI(체질량지수)를 계산하여 계산된 값에 따라 
//	저체중(18.5미만), 정상체중(18.5이상 23미만), 과체중(23이상 25미만), 
//	비만(25이상 30미만), 고도비만(30이상)을 출력하세요. 

//  BMI 계산식 = 체중(kg) / (신장(m) * 신장(m) ) 
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키를 입력하세요 : ");
		double height = sc.nextInt();
		
		System.out.println("몸무게를 입력하세요 : ");
		double weight = sc.nextInt();
		
		double bmi = weight / ((height * height)*0.0001);
		String str = "고도비만";
		
		System.out.println(bmi);
		
		if(bmi <18.5) {
			str = "저체중";
		}else if(bmi>=18.5 && bmi<23) {
			str = "정상체중";
		}else if(bmi>=23 && bmi<25) {
			str = "과체중";
		}else if(bmi>=25 && bmi<30) {
			str = "비만";
		}
	
			System.out.println(str);

	}
}