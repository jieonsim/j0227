package t1_variable;

public class Test6 {
	public static void main(String[] args) {
		String name, job, address, sign;
		
		name = "김말숙";
		job = "회사원";
		address = "서울";
		sign = "!!!";
		
		System.out.println("__ 의 직업은 __ 이고 __ 에 산다");
		System.out.println(name + "의 직업은 " + job + "이고 " + address + "에 산다" + sign);
		
		System.out.println(name + "의 직업은 " +job+"이고 "+address+"에 산다" + sign); // "+변수명+"
		
		
	}
}
