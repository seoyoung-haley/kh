package kh.java.operator;

import java.util.Scanner;

public class OperatorStudy {

	public static void main(String[] args) {
		OperatorStudy study = new OperatorStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
		study.test5();
		
		
	}
	
	/** 삼항연산자
	 * 
	 *  (조건식) ? (참일 때 값) : (거짓일 때 값)
	 *  	조건식 : boolean 또는 boolean 으로 평가될 연산식
	 *  
	 */
	
	 public void test5() {
		// int a = 100;
		 
		 //String s = (a < 50) ? "a는 50보다 크다" : "a는 50보다 작다";
		 //System.out.println(s);
		 
		 //사용자에게 입력받은 정수가 홀수/짝수인지 출력
		 // 100은 짝수입니다.
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수를 입력하세요 : ");
		 int n = sc.nextInt();
		 String nType = (n % 2 != 0) ? "홀" : "짝";
		 System.out.printf("%d은/는 %s수입니다.%n", n, nType);

		 // String nType = (n % 2 == 0) ? n+"은 짝수입니다" : n+"은 홀수입니다";
		// System.out.println(nType);
	 }
	
	
	/** 이항연산자
	 * 
	 * && and 형 또는 boolean으로 평가되는 조건식
	 * 	a && b 
	 * 	a b 모두 true 일 때, true 반환
	 * 
	 * 	true && true -> t
	 * 	t && f -> f
	 * 	f && t -> f (우항 검사 안함) ->이미 결과가 좌항을 통해 나오기 때문에
	 *  f && f -> f	(우항 검사 안함)
	 * 
	 * || or 형 또는 boolean으로 평가되는 조건식
	 * 	a || b
	 * 	a b 중에 하나라도 true라면, true를 반환
	 * 
	 *	true || true -> t
	 * 	t || f -> t
	 * 	f || t -> t (우항 검사 안함) ->이미 결과가 좌항을 통해 나오기 때문에
	 *  f || f -> f
	 * 
	 */
/**		public void test4() {
			int a = 10;
			int b = 7;
		
		System.out.println(a == 10 && b == 7);	
		System.out.println(a == 10 && b != 7);	
		System.out.println(a != 10 && b == 7);	
		System.out.println(a!= 10 && b != 7);	
		
		System.out.println(a == a || b < 10);	
		System.out.println(a > 5 || b < 5);	
		System.out.println(a == 7 || b != 10);	
		System.out.println(a != 10 || b != 7 );	
		
		int x = 1;
		int y = 1;
		
//		System.out.println(x == 1 && ++y == 2);
//		System.out.println(x != 1 && ++y == 2);
//		System.out.printf("x = %d, y = %d%n" , x, y);
		
		
		}
	/** 이항연산자
	 * +
	 * -
	 * *
	 * /
	 * %
	 */
	
	
	
	
	
	
	
/*	
	public void test3() {
		int a = 10;
		int b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);	// 몫
		System.out.println(a % b);	// 나머지
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int n = sc.nextInt();
		System.out.println("짝수인가? " + (n % 2 == 0));
	}
	/*
	public void test2() {
		int x = 10; 
		int y = 10;
		int z = ++x; // x = x + 1;
		
		System.out.println(z); //11
		System.out.println(x); //11
		
		z = y++;
		System.out.println(z); //10
		System.out.println(y); //11
		
		x = 20;
		z = x++ + --y;
		System.out.println(x);// 21
		System.out.println(y);// 10
		System.out.println(z);// 30
		
		int m = 20;
		int n = m++ + m;
		System.out.println(m);// 21
		System.out.println(n);// 41
	
		
	}
		
	/**
	 * 1. 단항연산자
	 * + -
	 * 
	 * ++
	 * --
	 */
//	public void test1(){
//		int a = +3;
//		int b = -3;
//		System.out.println(a);
//		System.out.println(b);
		
		// 증감연산자
		//1. 전위증감연산자 피연산자c ++c --c : 먼저 1 증감 후에 인접 연산 처리
		//2. 후위증감연산자 피연산자c c++ c-- : 먼저 인접 연산에 사용 1 증감 처리
//		int c = 10;
//		++c;
//		c = c +1;
		
//		--c;
//		c= c -1;
//		System.out.println(c);
		
		
//		int k = 1; //			인접연산
//		System.out.println(++k + 1); //먼저 1증감 -> 2 + 1 인접 연산 계산 -> 3
//		System.out.println(k++ + 1); //먼저 인접 연산 계산 ->1 + 1 -> 2
//		System.out.println(k); 
		
		
//		int m = 3;
//		int n = m++;
//		System.out.println(m);
//		System.out.println(n);
//	}

}
