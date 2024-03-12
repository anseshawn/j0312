package t2_nested2;

public class Test1Run {
	public static void main(String[] args) {
		System.out.println("이곳은 Test1Run 클래스의 main 메소드 입니다.");
		System.out.println();
		
		Test1 t1 = new Test1();
		System.out.println("su : "+t1.su);
		t1.modTest1();
		System.out.println();
		
		new Aa(); //외부(일반) 클래스
		System.out.println();
		
		Test1.Aa t1a = new Test1.Aa(); // 내부 클래스를 정적으로 선언했기때문에 (클래스명).(클래스명)으로 접근
		System.out.println("suA : "+t1a.suA);
		System.out.println("suB : "+t1a.suB); // 정적 멤버로 올라간 변수를 힙영역에서 불러옴
		t1a.modTest1A();
		t1a.modTest1B();	
		System.out.println();
		
		System.out.println("suB : "+Test1.Aa.suB); // 클래스 이름으로 메소드 영역으로 접근하여 변수 호출
		Test1.Aa.modTest1B();
	}
}
