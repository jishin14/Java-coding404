package quiz02;

public class AccMain {

	public static void main(String[] args) {
		
		Account acc = new Account("홍길동", "1234", 2500);
		
		acc.deposit(1000);
		acc.withDraw(2000); //-2000
		
		int money = acc.getBalance();
		System.out.println("현재잔액:" + money);
	}
}
