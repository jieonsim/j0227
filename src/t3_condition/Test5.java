package t3_condition;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		String result = "";
		
		System.out.print("점수를 입력하세요 : ");
		score = scanner.nextInt();
		
		if (score >= 90) {
			result = "A";
		}
		else if(score >= 80) {
			result = "B";
		}
		else if(score >= 70) {
			result = "C";
		}
		else if(score >= 60) {
			result = "D";
		}
		else {
			result = "F";
		}
		
		System.out.println("점수 " + score + "점으로 " + result + "학점입니다.");
		
		scanner.close();
	}
}
