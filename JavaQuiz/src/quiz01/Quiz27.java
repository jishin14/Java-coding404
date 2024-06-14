package quiz01;

import java.util.Arrays;

public class Quiz27 {

	public static void main(String[] args) {

		/*
		배열에 앞에 data를 추가하려고 합니다.
		1. 새로운 배열+1 생성합니다.
		2. 기존배열을 다음인덱스번째로 옴겨담는다.
		3. 0번째에 data를 추가.
		
		*/
		int[] arr = {10, 20, 30, 40, 50 };
		int data = 100;
		
		//1
		int[] newArr = new int[arr.length + 1];
		//2.
		for(int i = 0; i < arr.length; i++) {
			newArr[i+1] = arr[i];
		}
		newArr[0] = data; //앞에 추가
		
		System.out.println(Arrays.toString(newArr));
		
		
		
		
		
		
		
		

		
		
		
		
		
	}
}
