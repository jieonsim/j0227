package t3_condition_ex;

import java.util.Scanner;

public class Ex2Ref {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max = 0, min = 0;
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int firstNumber = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int secondNumber = scanner.nextInt();
		
		System.out.println("---------- 결과 ----------");
		
		if (firstNumber > secondNumber) {
			max = firstNumber;
			min = secondNumber;
		}
		else if (secondNumber > firstNumber) {
			max = secondNumber;
			min = firstNumber;
		}
		else {
			System.out.println("두 숫자는 같습니다.");
		}
		
		System.out.println("입력하신 두 숫자 중 큰 숫자는 " + max + " 입니다.");
		System.out.println("입력하신 두 숫자 중 작은 숫자는 " + min + " 입니다.");
		
		scanner.close();
	}
}


