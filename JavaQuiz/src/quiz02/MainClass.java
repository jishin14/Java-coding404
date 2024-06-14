package quiz02;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person("홍길동", 20, 180);
		p.info();
		
		Person p2 = new Person();
		p2.name = "이순신";
		p2.age = 20;
		p2.tall = 170;
		
		p2.info();
		
	}
}
