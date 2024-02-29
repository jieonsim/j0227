package t3_condition_ex;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String result = "";
		
		System.out.print("숫자를 입력하세요 : ");
		int number = scanner.nextInt();
		
		if((number % 2 == 0) && (number % 3 ==0)) {
			result = "2의 배수이자 3의 배수";
		}
		else if((number % 2 == 0) && (number % 5 ==0)) {
			result = "2의 배수이자 5의 배수";
		}
		else if (number % 2 == 0) {
			result = "2의 배수";
		}
		else if ((number % 3 == 0) && (number % 5 ==0)) {
			result = "3의 배수이자 5의 배수";
		}
		else if(number % 3 == 0) {
			result = "3의 배수";
		}
		else if (number % 5 == 0) {
			result = "5의 배수";
		}

		System.out.println("입력하신 " + number + "은 " + result + "입니다.");
		
		scanner.close();
	}
}
