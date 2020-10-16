package javaapp1008;

public class Practice1 {

	public static void main(String[] args) {
		//사용자가 복사할 매수를 입력
		//1~100장까지는 50원, 101~1000장까지는 40원 그이상은 30원으로 계산하여 총금액을 출력
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.printf("출력할 매수를 입력하세요: ");
		int count = sc.nextInt();
		int price = 0;
		
		sc.close();
		
		if ( count > 1000 ) {
			price = 30;
		} else if ( count <= 1000 && count > 100) {
			price = 40;
		} else {
			price = 50;
		}
		
		int money = price * count;
		
		System.out.printf("총 %d원 입니다.", money);
	}

}
