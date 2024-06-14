package quiz01;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		//두 수 사이의 합
		//힌트를 주자면, 큰수 작은수를 먼저 판별
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int max = 0;
		int min = 0;
		int sum = 0; //합계
		
		if(a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		System.out.println( max == min ? 0 : sum );
		
		
		
		
		
		
		
		
		
	}
}
