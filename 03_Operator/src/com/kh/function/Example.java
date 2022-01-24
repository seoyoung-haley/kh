package com.kh.function;

import java.util.Scanner;

public class Example {
	
	
	public void opSample1() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요 : ");
		int k = sc.nextInt();
		System.out.println("영어점수를 입력하세요 : ");
		int e = sc.nextInt();
		System.out.println("수학점수를 입력하세요 : ");
		int m = sc.nextInt();

		int z = (k + e + m);
		double a = (z / 3);
		
		String pass = (z >= 120 && a >= 60) ? "합격" : "불합격";
		System.out.printf("%s 입니다.%n%n" , pass);
		sc.nextLine();
		
		
	
	}
	
	public void opSample2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생이름 : ");
		String name = sc.nextLine();
		
		System.out.println("학년 : ");
		int grade = sc.nextInt(); 
		
		System.out.println("반 : ");
		int sclass = sc.nextInt(); 
		
		System.out.println("번호 : ");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.println("성별(M/F) : ");
		String temp = sc.next(); 
		char gender = temp.charAt(0); 

		System.out.println("성적 : ");
		double record = sc.nextDouble();

		String gen = gender == 'M' ? "남학생" : "여학생";
		System.out.printf("%d학년 %d반 %d번 %s %s은(는) 성적이 %.2f이다.%n", grade, sclass, number, gen, name, record);
		}

	public void opSample3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 :");
		int a = sc.nextInt();
		
		System.out.println(a > 0 ? "양수다." : "양수가 아니다.");
		
		
	}
	
	public void opSample4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 :");
		int d = sc.nextInt();
		String u = sc.nextLine();
		
		u = d % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(u);
	}
	}


