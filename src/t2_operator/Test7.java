package t2_operator;

import java.util.Scanner;

/*정수 90점 이상이면 'A', 정수 80점 이상이면 'B', 정수 70점 이상이면 'C',
정수 60점 이상이면 'D', 60점 미만은 'F'학점으로 처리 하시오.
*/

public class Test7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String result;
		System.out.print("점수를 입력하세요 : ");
		int score = scanner.nextInt();
		
		result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
		System.out.println("점수 " + score + "점으로 "+ result + "학점입니다.");
		
		scanner.close();
	}
}
