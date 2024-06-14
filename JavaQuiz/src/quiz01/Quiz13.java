package quiz01;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		//개수세기
		Scanner scan = new Scanner(System.in);
		//어떤값을 누적할 변수
		
		int n = scan.nextInt();
		
		int cnt = 0; //카운트를 셀 변수
		
		int i = 1;
		while(i <= n) {
			
			//조건 -  4의 배수이면서 8의배수가 아니면 개수를 증가+
			if( i % 4 == 0 && i % 8 != 0 ) {
				cnt++;
			}
			
			i++;
		}
		
		System.out.println(cnt);
		
		
		
		
		
		
		
	}
}
