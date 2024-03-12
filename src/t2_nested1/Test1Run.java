package t2_nested1;

//import t2_nested1.Test1.Aa;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println("Test1클래스의 su필드 : "+ t1.su);
		t1.modTest1();
		System.out.println();
		
		Aa aa = new Aa(); // 외부에 만들어놓은 다른 클래스
		System.out.println();
		
		Test1.Aa t1a = t1.new Aa(); // 중첩클래스 호출
		System.out.println("중첩클래스 안의 suA필드 : "+t1a.suA);
		t1a.modTest1A();
		
		
		// Aa t1a = t1.new Aa();
		// 외부에 같은 이름의 클래스가 없을 시 내부클래스의 이름으로 타입을 설정할 수 있음
		// 단, import로 걸어줘야 함
	}
}
