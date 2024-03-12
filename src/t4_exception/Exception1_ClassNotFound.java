package t4_exception;

public class Exception1_ClassNotFound {
	public static void main(String[] args) {
		 // 사용자가 클래스를 지웠거나 이동했을 경우가 있을 수 있으므로 오류가 남
		// java.lang.Object
		
		try {
			Class.forName("java.lang.Object2");
			System.out.println("java.lang 패키지에는 Object2 클래스가 있습니다.");
		} catch (ClassNotFoundException e) { //오류가 생길경우 e로 넘김
			//System.out.println("java.lang 패키지에는 Object2 클래스가 없습니다.");
			//e.printStackTrace(); //에러메세지를 출력해줌
			System.out.println("java.lang 패키지에는 Object2 클래스가 없습니다. : " + e.getMessage()); //에러메세지 수를 줄이고 요약해줌
		}
		System.out.println("작업끝......");
	}
}
