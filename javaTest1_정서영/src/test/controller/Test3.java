package test.controller;

public class Test3 {

	public static void main(String[] args) {

		int i = 1;
		double sum = 0;
		double avg = 0;
		
		while( i > 0 && i < 101) {
			
			sum += i;
			avg = sum / i;
			
			i ++;
			
			
			
		}
		System.out.printf("합계 : %.1f%n" , sum);
		System.out.printf("평균 : %.1f" , avg);
		
		
		
		
	}

}
