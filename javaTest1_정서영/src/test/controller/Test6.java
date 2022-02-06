package test.controller;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("정수 입력 => ");
	    int num = sc.nextInt();
	    
	    
	    String out = " ";
	    
	    switch(num) {

	    case 1: out = "** 입력이 정상적으로 되었습니다! **";
	    		System.out.println(out);
	    break;
	    
	    case 2: out = "** 조회가 시작 되었습니다! **";
	    System.out.println(out);
	    break;
	    
	    case 3: out = "** 수정이 정상적으로 되었습니다! **";
	    System.out.println(out);
	    break;
	    
	    case 4: out = "** 삭제가 정상적으로 되었습니다! **";
	    System.out.println(out);
	    break;
	    
	    case 5: out = "** 정상적으로 종료 되었습니다! **";
	    System.out.println(out);
	    break;
	    
	    default: 
			System.out.println("** 다시 입력해 주세요! **");
			return; 
	    
	    
		
	}

}
}