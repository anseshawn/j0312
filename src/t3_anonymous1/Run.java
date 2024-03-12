package t3_anonymous1;

public class Run {
	public static void main(String[] args) {
		Car car = new Car();
		car.roll();
		car.roll2();
		System.out.println();
		
		car.mod1();
		System.out.println();
		
		car.mod2(); // 익명객체 호출
		System.out.println();
		
		car.mod3();
		//mod3이 메소드 안의 tire2.roll 호출 -> tire2로 정의한 클래스 안에서 roll 호출
	}
}
