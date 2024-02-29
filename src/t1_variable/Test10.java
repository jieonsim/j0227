package t1_variable;

public class Test10 {
	public static void main(String[] args) {
		double res;
		double r = 10;
		res = r * r * 3.14;
		System.out.println("1.res : " + res);
		
		// res = 10 / 3.0;
		res = (double) 10 / 3; // 10을 double로 캐스팅하여 10.0 / 3이된 것임
		System.out.println("2.res : " + res);		
	}
}
