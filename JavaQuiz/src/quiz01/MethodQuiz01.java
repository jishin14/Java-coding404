package quiz01;

public class MethodQuiz01 {

	public static void main(String[] args) {
		
		System.out.println( method3(1, 2, 3.14)  );
		System.out.println( method4(3) );
		method5("홍길동", 2);
		System.out.println( maxNum(3, 5) );
		System.out.println( abs(-3) );
		
	}
	
	//1
	static double method3(int a, int b, double c) {
		return a + b + c;
	}
	//2
	static String method4(int a) {
		if(a % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
	//3.
	static void method5(String str, int a) {
		for(int i = 1; i <= a; i++) {
			System.out.println(str);
		}
	}
	//4.
	static int maxNum(int a, int b) {
		return a > b ? a : b;
	}
	//5.
	static int abs(int a) {
		return a < 0 ? -a : a;
	}
	
	
	
}








