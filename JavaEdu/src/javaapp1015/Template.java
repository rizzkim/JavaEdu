package javaapp1015;

public class Template {

	public static void disp() {
		System.out.println("매개변수가 없는 static 메소드 호출");
	}
	
	public static void oneArg(String msg) {
		System.out.println("매개변수가 있는 static 메소드 호출");
		System.out.printf("매개변수 : %s\n", msg);
	}
	
	public static void memberDisp(int a) {
		System.out.printf("정수출력 : %d\n" , a);
	}
	
	public int returnMemberFunc(int a) {
		int result = a*a;
		return result;
	}
	
	
	

}
