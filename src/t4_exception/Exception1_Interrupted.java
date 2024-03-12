package t4_exception;

public class Exception1_Interrupted {
	public static void main(String[] args) { //자바 기본단위: ms(1/1000 sec)
		System.out.print("금주의 로또 번호는 : ");
		for(int i=0; i<6; i++) {
			int rand = (int)(Math.random()*45) + 1;
			System.out.print("...... ");
			try { Thread.sleep(1000); } catch (InterruptedException e) {} //try/catch로 예외처리
			System.out.print(rand + " / ");
		}
	}
}
