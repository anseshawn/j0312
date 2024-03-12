package t1_multiclass;

class Aa{
	public Aa() {//생성자
		System.out.println("이곳은 Aa클래스 입니다.");
	}
}

public class Test1 {
	public static void main(String[] args) {
		System.out.println("이곳은 Test1 클래스의 main 메소드 입니다.");
		
		new Aa();
		
		new Bb();
		
		System.out.println("작업을 마칩니다.");
	}
}

class Bb{
	public Bb() {//생성자
		System.out.println("이곳은 Bb클래스 입니다.");
	}
}