package quiz01;

import java.util.Scanner;

public class Quiz22 {

	public static void main(String[] args) {
		
		/*
		 * 프로그램이 실행되면, 랜덤한 덧셈 문제를 출력해줍니다.
		 * 이 랜덤한 수의 범위는 1~100 사이의 값 입니다.
		 * 
		 * 사용자가 답안을 입력할 때마다, 정답 또는 오답 카운트가 누적됩니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		//누적할 변수
		int okCnt = 0;
		int noCnt = 0;
		
		while(true) {
			
			int a = (int)(Math.random() * 100) + 1;
			int b = (int)(Math.random() * 100) + 1;
			
			//랜덤한 문제 생성
			System.out.println("--------------");
			System.out.println(a + " + " + b + " = ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			//입력
			int answer = scan.nextInt();

			if(answer == 0) {
				System.out.println("프로그램 정상종료");
				break; 
			}
			
			//비교
			if(a + b == answer) { //정답인경우
				okCnt++;
				System.out.println("정답입니다!");
			} else { //정답이 아닌경우
				noCnt++;
				System.out.println("틀렸는데요?");
			}
			
		}
		
		System.out.println("정답:" + okCnt);
		System.out.println("오답:" + noCnt);
		
		
		
		
		
		
		
		
		
		
	}
	
}
		
		
		
		
		
		
		
		
