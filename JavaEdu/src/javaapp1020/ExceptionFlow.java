package javaapp1020;

public class ExceptionFlow {

	public static void main(String[] args) {
		int [] ar = {20, 30, 10, 50};
		try {
			
			System.out.printf("[0] : %d\n", ar[0]);
			System.out.printf("[3] : %d\n", ar[3]);
		} catch (Exception e){
			//예외 내용을 출력 
			System.out.printf("예외 내용 : %s\n", e.getMessage());
			//예외 발생 지점을 역추적
			e.printStackTrace();
		} finally {
			System.out.printf("무조건 수행\n");
			ar[0] = 30;
		}
	}

}
