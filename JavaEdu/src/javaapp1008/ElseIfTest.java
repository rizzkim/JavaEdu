package javaapp1008;

public class ElseIfTest {

	public static void main(String[] args) {
		
		//90이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D, 그 이외는 F
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		
		if ( score >= 90 ) {
			System.out.println("A");
		} else if ( score >=80 ) {
			System.out.println("B");
		} else if ( score >=70 ) {
			System.out.println("C");
		} else if ( score >=60 ) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		sc.close();

	}

}
