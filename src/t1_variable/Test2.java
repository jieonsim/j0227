package t1_variable;

public class Test2 {
	public static void main(String[] args) {
		int a1 = 10;
		int a2 = 010; // 0으로 시작되는 리터럴은 8진수로 간주한다.
		int a3 = 0x10; // 0x으로 시작되는 리터럴은 16진수로 간주한다.
		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
		System.out.println("a3 : " + a3);
		System.out.println();
		
		int num = 10;
		
		String binaryNum = Integer.toBinaryString(num); // 2진수를 10진수로 변환하는 메소드
		String octalNum = Integer.toOctalString(num); // 2진수를 8진수로 변환하는 메소드
		String hexNum = Integer.toHexString(num); // 2진수를 16진수로 변환하는 메소드
		
		System.out.println("10진수 num : " + num);
		System.out.println("2진수 binaryNum : " + binaryNum);
		System.out.println("8진수 octalNum : " + octalNum);
		System.out.println("16진수 hexNum : " + hexNum);
	}
}
