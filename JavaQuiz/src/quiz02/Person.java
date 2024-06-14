package quiz02;

public class Person {

	String name;
	int age;
	int tall;
	
	//프로그래머가 생성자를 만들면, 기본생성자를 자동으로 만들지 않음
	Person() {
		
	}
	
	Person(String pName, int pAge, int pTall) {
		name = pName;
		age = pAge;
		tall = pTall;
	}
	
	void info() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("키:" + tall);
	}
	
}
