package t2_nested1;

// 중첩클래스 : 인스턴스 멤버 클래스
public class Test1 {
	int su = 100; //필드
	
	public Test1() { //기본생성자
		System.out.println("이곳은 Test1 클래스입니다.");
	}
	
	public void modTest1() { //메소드
		System.out.println("이곳은 Test1 클래스의 modTest1 메소드 입니다.");
	}
	
	public class Aa { //중첩클래스
		// int su = 100; 가능 (독립적인 클래스)
		int suA = 200; //중첩클래스의 필드
		// static int suB = 250; : 인스턴스 안에서는 static 사용 불가
		
		public Aa() { //중첩클래스의 생성자
			System.out.println("이곳은 중첩클래스 Aa 클래스입니다.");
		}
		
		public void modTest1A() { //중첩클래스의 메소드
			System.out.println("이곳은 Aa 클래스의 modTest1A 메소드 입니다.");
		}
		// public static void modTest1B() {} : 인스턴스 안에서는 static 사용 불가
	}
}

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다.");
	}
}