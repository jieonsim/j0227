package t3_condition_ex;

import java.util.Scanner;

public class Ex3Ref {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int number = scanner.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("2의 배수입니다.");
		}
		if(number % 3 == 0) {
			System.out.println("3의 배수입니다");
		}
		if(number % 5 == 0) {
			System.out.println("5의 배수입니다.");
		}
		scanner.close();
	}
}
