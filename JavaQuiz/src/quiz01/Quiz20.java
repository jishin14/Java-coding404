package quiz01;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		/*
		 * 가로, 세로를 입력받아서 사각형을 출력합니다.
		 * 단, 윤곽만 출력합니다.
		 * 힌트 - 첫행, 마지막행, 첫열, 마지막열 에 출력.
		 */
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt(); //가로
		int h = scan.nextInt(); //세로
		
		for(int i = 1; i <= h; i++) { //세로
			for(int j = 1; j <= w; j++) { //가로
				
				if(i == 1 || i == h) { //첫, 마지막 행
					System.out.print("*");
				} else { //나머지 행
					if(j == 1 || j == w) { //첫, 마지막 열
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
