package quiz02;

public class Account {

	String name;
	String password;
	int balance;
	
	Account(String pName, String pw, int bal) {
		name = pName;
		password = pw;
		balance = bal;
	}
	
	//입금 - 매개변수로 입력받은 값을 멤버변수 누적
	void deposit(int money) {
		balance += money;
	}
	//출금
	void withDraw(int money) {
		balance -= money;
	}
	//잔액조회
	int getBalance() {
		return balance; //클래스 외부에서 값을 가져갈 수 있음
	}
	
	
	
	
	
}
