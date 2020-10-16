package practice1006;

public class FormatDisplay {

	public static void main(String[] args) {

//		int a = 10;
//		int b = 3;
//		System.out.printf("%2d\n", a);
//		System.out.printf("%2d\n", b);
		
//		String name1 = "김도형";
//		int age1 = 35;
//		
//		String name2 = "리쯔";
//		int age2 = 8;
//		
//		System.out.printf("%-5s%3d\n", name1, age1);
//		System.out.printf("%-5s%3d\n", name2, age2);
		
//		하나로 표현해야 하는 데이터를 생각해보고
//		그 데이터를 저장할 수 있는 변수를 만들어서
//		데이터를 저장하고 원하는 포맷으로 출력
//		
//		선수 데이터를 (저장)
//		선수 일련번호 (정수)
//		선수 이름 (문자열)
//		선수 랭킹 (정수)
//		선수 점수 (정수)
		
		char player = 'A';
		int num = 1;
		String name = "김도형";
		int rank = 1;
		double score = 90.155;
		
		System.out.printf("%3c%5d%5s%5d%7.1f\n", player, num, name, rank, score);
		
		
	}

}
