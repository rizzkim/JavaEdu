package javaapp1015;

public class TemplateMain {

	public static void main(String[] args) {
		
		//1. Template 클래스의 disp는 고정된 문자열을 출력해주는 메소드
		//원형은 static void disp() 이 메소드를 호출
		Template.disp();
		
		//2. Template 클래스의 oneArg는 문자열을 입력받아서 출력해주는 매소드
		//원형은 static void oneArg(String) 이 메소드를 호출해서 원하는 메세지 출력
		Template.oneArg("출력 테스트");
		
		//3. Template 클래스의 memberDisp는 정수를 입력받아서 출력하는 메소드
		//원형은 void memberDisp(int) 원하는 숫자를 입력해서 숫자를 출력해보세요
		Template test = new Template();
		test.memberDisp(77);
				
		//4. Template 클래스의 returnMemberFunc은 정수를 입력받아서 제곱값을 출력하는 메소드
		int r = test.returnMemberFunc(4);
		System.out.printf("제곱값 출력 : %d\n", r);
		
	}

}
