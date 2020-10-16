package practice1007;

public class ExLogical {

	public static void main(String[] args) {
		// 윤년이면 윤년이라고 출력하고 윤년이 아니면 아니라고 출력
		// 윤년이 되는 2가지 조건
		int year = 2020;
		// 1. 4의배수이고 100의 배수는 아닌경우
		// 2. 400의 배수인 경우
		if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("year는 윤년");
		} else {
			System.out.println("year는 윤년 아님");
		}

	}

}
