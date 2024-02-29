package t1_variable;

// 정수형 타입 (byte, char, short, int, long)
public class Test3 {
	public static void main(String[] args) {
		byte bb1, bb2;
		bb1 = 127;
		// bb1 = 128; byte 타입의 수치 표현 범위 : -128 ~ +127까지 가능
		
		bb2 = -128;
		// bb2 = -129; 불가
		
		System.out.println("bb1 : " + bb1);
		System.out.println("bb2 : " + bb2);
		System.out.println();
		
		short ss1 = 128, ss2 = -129;
		System.out.println("ss1 : " + ss1);
		System.out.println("ss2 : " + ss2);
		System.out.println();
		
		// short ss3 = 33000; 수치 표현 범위를 넘어 불가
		int ii1 = 33000;
		System.out.println("ii1 : " + ii1);
		System.out.println();
		
		int ii2 = 210000000;
		System.out.println("ii2 : " + ii2);
		System.out.println();
		
		// int ii3 = 220000000; 수치 표현 범위를 넘어 불가
		
		long ll1 = 220000000L;
		System.out.println("ll1 : " + ll1);
		System.out.println();
		
		char cc1 = 'A';
		System.out.println("cc1 : " + cc1);
		// System.out.printf("cc1 = %d\n", cc1);
		
		int cc2 = 'A';
		System.out.printf("cc2 = %d\n", cc2);
		
		int cc3 = 'a';
		System.out.printf("cc3 = %d\n", cc3);
		
		char cc4 = '한';
		System.out.println("cc4 : " + cc4);
		
		int cc5 = '한';
		System.out.println("cc5 : " + cc5);

		char cc6 = '\u0041';
		System.out.println("cc6 : " + cc6);
		
	}
}
