package quiz01;

public class Quiz24 {

	public static void main(String[] args) {
		
		//배열이 주어질때, 배열 요소중 가장큰값 하나만 출력.
		int[] arr = {34, 65, 12, 34, 56, 100, 54, 21, 99};
	
		int max = arr[0]; //가장큰값
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
		
		
		
		
		
		
		
		
	}	
}
