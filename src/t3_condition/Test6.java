package t3_condition;

import java.util.Scanner;

/*
 입력받은 수가 '양수/음수/0'인지 판별하시오
 */
public class Test6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int su = 0;
		String str;
		
		System.out.print("-> 숫자를 입력하세요 : ");
		su = scanner.nextInt();
		
		if(su > 0) str = "양수";
		else if (su < 0) str = "음수";
		else str = "0";
		
		System.out.println("입력된 수 " + su + "는 " + str + "입니다.");
		
		scanner.close(); // 종료 후 가비지 컬렉터가 해결 못해주기 때문에 강제로 클로즈 해줘야함
	}
}
