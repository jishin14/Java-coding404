package day08.overriding.basic;

public class MainClass {

	public static void main(String[] args) {
		
		
		Child c = new Child();
		c.method01(); //물려받은메서드
		c.method02(); //오버라이딩된 메서드
		
	}
	
	
}
