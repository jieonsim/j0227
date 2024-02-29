package t3_condition_ex;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String result;
		
		System.out.print("수를 입력하시오 : ");
		int number = scanner.nextInt();
		
		result = (number % 2 == 0) ? "짝수" : "홀수";
		System.out.println("입력하신 숫자 " + number + "는 " + result + "입니다.");
		
		scanner.close();
	}
}

