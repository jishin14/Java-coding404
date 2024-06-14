package quiz05;

public class MainClass {

	public static void main(String[] args) {
		
		MyAccount mc = new MyAccount("홍길동", "1234", 1000);
		
		mc.withDraw(1000); //출금
		
		System.out.println("잔액:" + mc.getBalance() );
		
		
	}
}
