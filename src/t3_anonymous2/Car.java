package t3_anonymous2;

// 상속과 인터페이스 동시 진행
public class Car extends Tire implements Company {

	@Override
	public void roll() {
		System.out.println("추상 타이어가 굴러갑니다.");
	}
	
	public void mod1() {
		System.out.println("이곳은 Car(자식객체)클래스의 mod1메소드 입니다.");
	}
	
	//익명객체는 항상 자식객체 안에서 (상속을 받거나 인터페이스를 구현하는 객체 안에서)	
	Tire tire1 = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명객체에서의 타이어가 굴러갑니다.");
		}
	};
	
	public void mod2() {
		tire1.roll();
		tire1.roll2();
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

	//인터페이스에 정의된 추상메소드를 오버라이딩처리하고 있다
	@Override
	public void companyName(String company) {
		System.out.println("타이어 제조회사 : " + company);
	}
	
	Company company = new Company() {	
		@Override
		public void companyName(String company) {
			System.out.println("(익명객체)타이어 제조회사 : " + company);
		}
	};
	
	public void mod4() {
		company.companyName("한국타이어");
	}

}
