package javaapp1012;

public class Star {

	public static void main(String[] args) {
//		1 ***** 1-5
//		2 ***** 1-5
//		3 ***** 1-5
//		4 ***** 1-5
//		5 ***** 1-5
//		별 5개를 출력하고 줄 바꿈 하는 것을 5번 수행
//		가로방향이 안쪽 반복문
//		세로방향이 바깥쪽 반복문
		
		for (int i=1; i<=5; i=i+1) {
			for (int j=1; j<=5; j=j+1) {
				System.out.printf("*");
			}
			
			System.out.println();
		}
		
		System.out.println("====================================");
		
//		*이 하나씩 증가하는 구조
//		변하는 숫자의 증감치를 구해서 바깥쪽 반복문의 변수에 곱한후 더하기 빼기를 이용해서 결과를 맞추는 작업을 수행 1씩증가하므로 1*i
		for (int i=1; i<=5; i=i+1) {
			for (int j=1; j<=i; j=j+1) {
				System.out.printf("*");
			}
			
			System.out.println();
		}
		
		System.out.println("====================================");
		
//		*이 하나씩 감소하는 구조
//		변하는 숫자의 증감치를 구해서 바깥쪽 반복문의 변수에 곱한후 더하기 빼기를 이용해서 결과를 맞추는 작업을 수행 1씩증가하므로 -1 * ㅑ
		for (int i=1; i<=5; i=i+1) {
			for (int j=1; j<=6-i; j=j+1) {
				System.out.printf("*");
			}
			
			System.out.println();
		}
		
		System.out.println("====================================");
		
//		*이 하나씩 증가한후 감소하는 구조
//		3째줄까지 1개씩늘어나고 4째줄부터는 1개씩 줄어드는 구조
//		하나의 패턴이 아닌경우 동일패턴이 적용되는 지점까지 분할을 해서 해결
		for (int i=1; i<=5; i=i+1) {
			if (i<=3) {
				for (int j=1; j<=i; j=j+1) {
					System.out.printf("*");
				}
			} else {
				for (int j=1; j<=6-i; j=j+1) {
					System.out.printf("*");
				}
			}
			
			System.out.println();
		}
		
		System.out.println("====================================");
		
//		트리
		for (int i=1; i<=5; i=i+1) {
			
			for (int k=5; k>i; k=k-1) {
				System.out.printf(" ");
			}
			
			for (int j=1; j<=i; j=j+1) {
				if( j == 1 || j == i || i == 5 ) {
					System.out.printf(" *");
				} else {
					System.out.printf("  ");
				}
			}
			
			System.out.println();
		}

	}
	
}
