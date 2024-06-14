package quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		//거스름 돈은 어떻게?
		int[] arr = {1000, 500, 100, 50, 10}; 

		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		/* money = 17780
		 * 17780 / 1000 = 17개
		 * money = money % 1000  
		 * 780 / 500 = 1개
		 * money = money % 500  
		 * 280 / 100 = 2개
		 * money = money % 100 
		 * 80 / 50 = 1개
		 * money = money % 50
		 * 30 / 10 = 3개
		 */
		
		int i = 0;
		while(i < arr.length) {
			
			System.out.print( arr[i] + " " + money / arr[i] + " " );
			money %= arr[i]; //money = money % arr[i]
			
			i++;
		}
 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
