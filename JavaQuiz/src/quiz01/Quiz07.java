package quiz01;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		//큰 수 찾기
		/*
		 * 숫자 2개를 입력 받아, 큰 숫자를 출력하는 프로그램 코드를 작성하세요.
			같은 수라면 0을 출력하면 됩니다
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num == num2) { //같은경우
			System.out.println(0);
		} else if(num > num2) { //num이 큰경우
			System.out.println(num);
		} else { //num2가 큰경우
			System.out.println(num2);
		}
		
		scan.close();
		
		
		
		
		
		
	}
}
