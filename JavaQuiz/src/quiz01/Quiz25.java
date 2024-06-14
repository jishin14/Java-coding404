package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz25 {

	public static void main(String[] args) {
		
		//백준 - 1차원배열 - 10818번
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int[] arr = new int[size];
		
		int i = 0;
		while(i < arr.length) {
			arr[i] = scan.nextInt();
			i++;
		}
		
		int max = arr[0]; //배열의 첫번째요소
		int min = arr[0];
		
		int j = 0;
		while(j < arr.length) {
			
			if(arr[j] > max ) {
				max = arr[j]; //최대값
			} 
			
			if(arr[j] < min ) {
				min = arr[j];
			}
			
			j++;
		}
		
		System.out.println(min + " " + max);
		
		
		
		
		
		
	}
}
