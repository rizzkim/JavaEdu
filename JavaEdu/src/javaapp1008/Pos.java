package javaapp1008;

public class Pos {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.printf("메뉴를 입력하세요(1:아메리카노,2:라떼,3:프라프치노) : ");
		int menu = sc.nextInt();
		System.out.printf("수량을 입력하세요(1~9개 주문가능) : ");
		int ea = sc.nextInt();
		System.out.printf("주문이 맞습니까?(Y/N) : ");
		sc.nextLine();
		String input = sc.nextLine();
		
		// 메뉴 1.아메리카노, 2.라떼, 3.에이드
		int ame = 1000;
		int latte = 1500;
		int ade = 2000;
		
		int total=0;
		
		final String Y = "Y";
		final String N = "N";
		
		switch(input) {
		case Y:
			System.out.println("주문완료");
		
			if (menu <=3 && ea <= 9 && input.equals("Y")) {
				switch(menu) {
					case 1:
						total = ame*ea;
						break;
					case 2:
						total = latte*ea;
						break;
					case 3:
						total = ade*ea;
						break;
					default:
						System.out.println("다시 주문해주세요.");
						break;
				}
				System.out.printf("총액은 %d원입니다.",total);
			} else if (menu > 3 || ea <= 9) {
				System.out.println("없는 메뉴 입니다.");
			} else if (menu <=3 || ea > 9) {
				System.out.println("10개이상 주문이 불가합니다.");
			} else if (menu > 3 && ea >9){
				System.out.println("다시주문해주세요");
			}
			break;
			
		case N:
			System.out.println("주문취소");
			break;
			
		default:
			System.out.println("주문실패");
			break;
		}
		
		
		sc.close();

	}

}
