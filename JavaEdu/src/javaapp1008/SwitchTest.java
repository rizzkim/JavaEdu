package javaapp1008;

public class SwitchTest {

	public static void main(String[] args) {
		//menu가 1이면 중식 2번이면 한식 3번이면 분식을 출력
		int menu = 3;
		
		//가독성을 높이기 위한 final 변수 - 값을 변경하지 못함
		final int CHINA = 1;
		final int KOREA = 2;
		final int SNACK = 3;
		
		switch (menu) {
		case CHINA:
			System.out.println("중식\n");
			break;
		case KOREA:
			System.out.println("한식\n");
			break;
		case SNACK:
			System.out.println("분식\n");
			break;
		default : 
			System.out.println("잘못된 메뉴\n");
			break;
		}
	
	}

}
