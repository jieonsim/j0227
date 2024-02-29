package t1_variable;

public class Test9 {
	public static void main(String[] args) {
		String str1 = "안녕";
		String str2 = "하세요";
		// String name = "홍길동";
		
		System.out.println(str1 + str2);
		System.out.println(str1 + "\t" + str2);
		System.out.println(str1 + "\n" + str2);
		System.out.println(str1 + "'s" + str2);
		System.out.println("안녕's하세요");
		System.out.println("안녕\"s하세요"); // 역슬래시+"(\") 를 입력하면 "를 문자열로 표기할 수 있음, 역슬래시가 제어표시
		System.out.println("안녕\\s하세요");
	}
}
