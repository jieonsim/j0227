package t2_operator;

// 삼항 연산자(조건식 ? 참 : 거짓)
public class Test4 {
	public static void main(String[] args) {
		// 정수 90점 이상이면 'A', 정수 80점 이상이면 'B', 정수 70점 이상이면 'C',
		// 정수 60점 이상이면 'D', 60점 미만은 'F'학점으로 처리 하시오.
		char res;
		int jumsu = 55;
		
		// res = (jumsu >= 90) ? 'A' : (jumsu >= 80) ? 'B' : 'c';
		res = (jumsu >= 90) ? 'A' : (jumsu >= 80) ? 'B' : (jumsu >= 70) ? 'C' : (jumsu >= 60) ? 'D' : 'F';
		System.out.println("점수 : " + jumsu + "은 "+ res + "학점입니다.");
	}
}
