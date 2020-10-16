package javaapp1008;

public class ConsoleInput {

	public static void main(String[] args) {
		
		// 키보드로부터 입력받는 Scanner 생성
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.printf("이름입력 : ");
		String name = sc.nextLine();
		
		// 점수를 입력받기
		System.out.printf("점수입력 : ");
		int score = sc.nextInt();
		
		// 주소를 입력받기
		System.out.printf("과목입력 : ");
		sc.nextLine();	// 숫자를 입력받은뒤 문자를 다시 입력받을때는 버퍼를 비우기위해 1번 호출해야 합니다.
		String address = sc.nextLine();
		
		System.out.printf("이름 : %s\n점수 : %d\n과목 : %s", name, score, address);
		
		// 스캐너 종료
		sc.close();
		
	}

}
