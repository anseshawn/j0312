package t3_anonymous1;

public class Car extends Tire{

	@Override
	public void roll() {
		System.out.println("추상 타이어가 굴러갑니다.");
	}
	
	public void mod1() {
		System.out.println("이곳은 Car(자식객체)클래스의 mod1메소드 입니다.");
	}
	
	//익명객체는 항상 자식객체 안에서 (상속을 받거나 인터페이스를 구현하는 객체 안에서)	
	Tire tire1 = new Tire() { // 필드에서 익명객체 사용
		@Override
		public void roll() {
			System.out.println("익명객체에서의 타이어가 굴러갑니다.");
		}
	};
	
	public void mod2() { // 익명객체 사용하기 위한 메소드
		tire1.roll();
		tire1.roll2(); // 위에서 Tire 객체를 생성했기 때문에 나오는 메소드
	}
	
	public void mod3() {
		// 메소드 안에서 익명 클래스 사용
		Tire tire2 = new Tire() {
			@Override
			public void roll() {
				System.out.println("메소드 안의 익명 객체에서 타이어가 굴러갑니다.");
			}
		};
		tire2.roll();
		
	}

}
