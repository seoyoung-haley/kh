package array.java;

public class Test7 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		double sum = 0;

		// 짝수 번지만 나와야함

		for (int i = 0; i < 10; i++) {

			if (array[i] % 2 == 0) {

				sum += i;

				System.out.println(i);
				

			}

		} System.out.printf("합계: %.1f" , sum);

	}

}
