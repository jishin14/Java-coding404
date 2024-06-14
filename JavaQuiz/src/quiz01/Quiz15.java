package quiz01;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		
		//약수의 합
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int sum = 0; //누적할 변수
		int i = 1;
		while( i <= n ) {
			
			//System.out.println(n + " " + i);
			if( n % i == 0) { //약수
				sum += i;
			}
			
			i++;
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
