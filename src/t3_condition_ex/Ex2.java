package t3_condition_ex;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int firstNumber = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int secondNumber = scanner.nextInt();
		
		System.out.println();
		
		if (firstNumber > secondNumber) {
			System.out.println("입력하신 두 숫자 중 큰 숫자는 " + firstNumber + " 입니다.");
			System.out.println("입력하신 두 숫자 중 작은 숫자는 " + secondNumber + " 입니다.");
		}
		else if (secondNumber > firstNumber) {
			System.out.println("입력하신 두 숫자 중 큰 숫자는 " + secondNumber + " 입니다.");
			System.out.println("입력하신 두 숫자 중 작은 숫자는 " + firstNumber + " 입니다.");
		}
		else {
			System.out.println("두 숫자는 같습니다.");
		}
		scanner.close();
	}
}


