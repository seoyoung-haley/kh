package com.kh.test.loop;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Test4 study = new Test4();
		study.test();
	}
	
//	문자열의 길이를 리턴하는 String의 메소드는 int length()
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 =>");
		String text = sc.next();

		System.out.println("검색 할 문자를 입력하세요 =>");
		char serch = sc.next().charAt(0);
		
		
		int rst = 0;
		
		if((serch >=65 && serch <=90) || ( serch>= 97 && serch <=122)) {

			for(int i = 0 ; i<text.length() ; i++) {
			
				    
					if(serch == text.charAt(i)) {
						
						rst += 1;
						
						}
					
								
				}
			
			System.out.printf("'%s'가 포함 된 개수는 %d개 입니다." , serch , rst);
			
		}else {
				System.out.println("영문자가 아닙니다.");
				
			}
			
		
//			System.out.println(rst); 확인용
		}
		
		
	 
}
