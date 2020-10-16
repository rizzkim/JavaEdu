package practice1007;

public class Logical {

	public static void main(String[] args) {
		int su = 12;
//		위의 수가 3의 배수인지 확인
//		3의 배수는 3으로 나눈 나머지가 0인 수
		if(su % 3 == 0) {
			System.out.println("3의 배수");
		} else {
			System.out.println("3의 배수 아님");
		}
		
//		3의배수이고 4의배수인지 확인
		if(su % 3 == 0 && su % 4 == 0) {
			System.out.println("3의 배수이고 4의 배수");
		} else {
			System.out.println("3과 4의 공통 배수는 아님");
		}
		
	}

}
