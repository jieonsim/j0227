package t3_condition;

import java.util.Scanner;

// 점수가 60점 이상이면 '합격', 60점 미만이면 '불합격' 처리하시오.
public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    int score = 0;
		String result = "";
		
		System.out.print("점수를 입력하세요 : ");
		score = scanner.nextInt();
		
		if (score >= 60) {
			result = "합격";
		}
		else {
			result = "불합격";
		}
				
		System.out.println("점수 " + score + "점으로 " + result + "입니다.");
				 
		scanner.close();
	}
}
