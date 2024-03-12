package t2_nested2;

// 중첩클래스 : 정적 멤버 클래스
public class Test1 {
	int su = 300; 
	
	public Test1() { //기본생성자
		System.out.println("이곳은 Test1 클래스입니다.");
	}
	
	public void modTest1() { //메소드
		System.out.println("이곳은 Test1 클래스의 modTest1 메소드 입니다.");
	}
	
	public static class Aa { //중첩클래스
		int suA = 400; //중첩클래스의 필드
		static int suB = 450;
		
		public Aa() { //중첩클래스의 생성자
			System.out.println("이곳은 중첩클래스 Aa 클래스입니다.");
		}
		
		public void modTest1A() { //중첩클래스의 메소드
			System.out.println("이곳은 Aa 클래스의 modTest1A 메소드 입니다.");
		}
		
		public static void modTest1B() { //중첩클래스의 static 메소드
			System.out.println("이곳은 Aa 클래스의 modTest1B 메소드 입니다.");
		}
		
	}
}

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다.");
	}
}