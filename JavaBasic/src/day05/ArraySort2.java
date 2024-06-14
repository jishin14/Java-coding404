package day05;

import java.util.Arrays;

public class ArraySort2 {

	public static void main(String[] args) {
		
		//버블정렬 - 가장 느린 정렬방식
		//가장 큰 수를 뒤로보냄
		int[] arr= {5, 23, 1, 43, 200, 100, 40 };
		/*
		 * 1회전
		 * 5, 1, 23, 43, 100, 40, 200
		 * 2회전
		 * 1, 5, 23, 43, 40, 100, 200
		 * 3회전
		 * 1, 5, 23, 40, 43, 100, 200 끝
		 * ....
		 */
		//바깥반복문이 회전수
		//안쪽반복문이 자리변경
//		for(int i = 0; i < arr.length - 1; i++) { //6번
//			for(int j = 0; j < arr.length-1-i; j++) {
//
//				if(arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//			System.out.println(Arrays.toString(arr));
//		}
		
		//가장빠른정렬 - 퀵정렬
		Arrays.sort(arr); 
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}
}
