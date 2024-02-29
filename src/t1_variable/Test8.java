package t1_variable;

// 강제 타입 변환(casting)
public class Test8 {
	public static void main(String[] args) {
		double su1 = 3.14;
		int res;
		
		// res = su1; 자동 형변환 불가, double을 int에 넣을 수 없기 때문에 error 발생
		
		// 강제 형변환
		res = (int) su1;
		System.out.println("res : " + res);
		
		short ss1 = 10, ss2;
		int ii1 = 100;
		
		// ii1 = ss1; → 자동 형변환
		// ss1 = ii1; → 에러 발생
		ss1 = (short) ii1;
		System.out.println("ss1 : " + ss1);
		
		int su = 1000000;
		System.out.println("su : " + su);
		
		ss2 = (short) su;
		System.out.println("ss2 : " + ss2);
	}
}
