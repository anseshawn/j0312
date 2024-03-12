package t2_nested3;

// 중첩클래스 : 로컬 클래스
public class Test1 {
	int su = 500; 
	
	public Test1() {
		System.out.println("이곳은 Test1 클래스입니다.");
	}
	
	public void modTest1() {
		System.out.println("이곳은 Test1 클래스의 modTest1 메소드 입니다.");
	}
	
	public void modClass() {	// 메소드
		int atom = 900;
		System.out.println("이곳은 Test1 클래스의 modClass 메소드 입니다.");
		System.out.println("이곳은 Test1 클래스의 modClass 메소드 안의 atom 변수 입니다. "+ atom);
		
		class Aa { // 로컬 클래스: 메소드 안에서 정의 - 메소드에서만 사용하고 메소드가 끝나면 소멸 (public 사용불가)
			int suA = 550;
			
			public Aa() {
				System.out.println("이곳은 중첩클래스 Aa 클래스입니다.");
			}
			
			public void modTest1A() {
				System.out.println("이곳은 Aa 클래스의 modTest1A 메소드 입니다.");
			}
		}
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		Aa aa = new Aa(); // 로컬 클래스 생성하여 사용
		System.out.println("중첩클래스 안의 suA : "+aa.suA);
		aa.modTest1A();		
		
	}
	
	
	public void modClass2() {
		class Aa {}
	}
	
	public void modClass3() {
		class Bb {}
	}
}

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다.");
	}
}