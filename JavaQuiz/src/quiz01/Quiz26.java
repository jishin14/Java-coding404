package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz26 {

	public static void main(String[] args) {
		
		//백준 - 10813번
		/* 
		 * 1,2,3,4,N 까지 쓰여있는 배열
		 * 
		 * N은 바구니 개수
		 * M은 swap할 횟수
		 *  5(N) 4(M)
		 *  1 2
			3 4
			1 4
			2 2
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //바구니개수
		int m = scan.nextInt(); //변경할 횟수
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		int i = 1;
		while(i <= m) {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			//자리바꿈
			int temp = arr[a - 1];
			arr[a - 1] = arr[b - 1];
			arr[b - 1] = temp;
			
			i++;
		}
		
		//출력
		for(int j = 0; j < arr.length; j++) {
			System.out.print( arr[j] + " " );
		}
		
		
		
		
		
		
		
		
		
		
	}
}
