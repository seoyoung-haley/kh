package com.kh.test.loop;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 study = new Test5();
		study.test();
	}

	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("작성 할 회원의 수를 입력하세요");
		int customer =sc.nextInt();
		sc.nextLine();

		String [] name = new String[customer];
		int[] age = new int [customer];
		String []addr = new String[customer];
		int[] height = new int[customer];
		int[] weight = new int[customer];
		String[] pnum = new String[customer];
		
		int aage =0;
		int acm =0;
		int akg =0;
		
		
		
		int aagep;
		int acmp;
		int akgp;

		
		
		
		for(int i = 0 ; i<customer ; i++ ) {

			
			System.out.printf("%d번 회원의 이름을 입력해주세요 => " , i + 1);
			name[i] =sc.next();
			
			
			System.out.printf("%d번 회원의 나이를 입력해주세요 => " , i + 1);
			age[i] = sc.nextInt();					
			sc.nextLine();
			
			aage += age[i]; // == aage = aage + age[i]
			
			System.out.printf("%d번 회원의 주소를 입력해주세요 => " , i + 1);
			addr[i] = sc.nextLine();
						
			System.out.printf("%d번 회원의 키를 입력해주세요 => " , i + 1);
			height[i] = sc.nextInt();		
			sc.nextLine();
			
			acm += height[i];
			
			System.out.printf("%d번 회원의 몸무게를 입력해주세요 => " , i + 1);
			weight[i] = sc.nextInt();
			sc.nextLine();
			
			akg += weight[i];
			
			System.out.printf("%d번 회원의 연락처를 입력해주세요 => " , i + 1);
			pnum[i] = sc.next();
		
			System.out.println();
		} 
		
		aagep = aage/customer;
		acmp = acm/customer;
		akgp = akg/customer;
		
		System.out.println("=============== 저장회원 ===============");

		for(int i = 0 ; i<customer ; i++ ) {
		System.out.printf("%d) %3s %3d세 %3s %3dcm %3dkg %3s%n" ,i + 1 , name[i] , age[i] , addr[i] , height[i] , weight[i] , pnum[i] );
//		System.out.printf("평균 나이 : %d세 / 평균 키 : %dcm / 평균 몸무게 : %dkg" , aage/customer , acm/customer , akg/customer);
		//  aage/customer , acm/customer , akg/customer -> 다른 변수세워서 간단화해보기

			} 
		System.out.printf("%n%n평균 나이 : %d세 / 평균 키 : %dcm / 평균 몸무게 : %dkg%n" , aagep , acmp , akgp);
		
		}
	}
	
	

