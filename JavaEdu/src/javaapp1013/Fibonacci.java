package javaapp1013;

public class Fibonacci {

	public static void main(String[] args) {
		//정수를 입력받아서 정수번째 피보나치 수열의 값 구하기
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//정수 입력받기
		System.out.print("구하고자 하는 수열의 위치는?");
		int n = sc.nextInt();
		
		int n1 = 1;
		int n2 = 1;
		int result = 1;
		
		//첫번째와 두번째는 고정이므로 세번째부터 게산
		for (int i=3; i<=n; i=i+1) {
			//이전 2개 항의 값을 더해서 result를 구함
			result=n1+n2;
			//이전 2개의 항의 값을 변경
			//이전 2개 항의 값을 자기 뒤의 값으로 변경
			n2=n1;
			n1=result;
		}
		//출력 - 10:5, 11:89
		System.out.printf("%d번째 값 : %d\n", n, result);
		
		
		//입력 객체 사용이 종료되었으므로 정리
		sc.close();

	}

}
