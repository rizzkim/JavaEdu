package javaapp1020;

public class ThrowsException {
	
	//main메소드에서 호출할 수 있도록 static 메소드로 생성 
	public static void method() throws Exception{ //이 메소드에서 발생하는 예외는 메소드를 호출하는 곳에서 처리해야한다.
		int i = 10;
		int j = 0;
		System.out.printf("%d\n", i%j);
	}
	
	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
