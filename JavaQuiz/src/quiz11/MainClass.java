package quiz11;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		String[] arr2 = {"a", "b" };
		char[] arr3 = {'a', 'b', 'c' };
		
//		String r = Arrays.toString(arr);
//		System.out.println(r);
//		System.out.println(Arrays.toString(arr2));
//		System.out.println(Arrays.toString(arr3));
		
		//결과
		System.out.println(MyArrays.toString(arr));
		System.out.println(MyArrays.toString(arr2));
		System.out.println(MyArrays.toString(arr3));

		
	}
}
