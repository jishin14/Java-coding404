package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz29 {

	public static void main(String[] args) {
	
		//백준 2차원배열 - 2566번
		//값을 순서대로 저장하는것부터 시작 
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[9][9];

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		//최대값 찾기
		int max = 0; //큰값
		int x = 0; //행
		int y = 0; //열
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > max  ) {
					max = arr[i][j];
					x = i;
					y = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println( (x+1) + " " + (y+1) );
		
		
		
		
		
		
		
		
		
		
	}
}
