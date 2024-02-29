package t2_operator;

import java.util.Scanner;

// 점수가 60점 이상은 '합격', 60점 미만은 '불합격'이라고 출력하시오.
// (String 변수에 담아서 출력하시오)
public class Test6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String result;
		
		System.out.print("점수를 입력하세요 : ");
		int score = scanner.nextInt();
		
		result = (score >= 60) ? "합격" : "불합격";
		System.out.println("점수 " + score + "점으로 " + result + "입니다.");
		
		scanner.close();
	}
}
