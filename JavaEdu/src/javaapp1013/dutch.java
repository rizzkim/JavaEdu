package javaapp1013;

public class dutch {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("총 금액을 입력하세요 : ");
		int sum = sc.nextInt();
		System.out.println("총 인원을 입력하세요 : ");
		int p = sc.nextInt();
		int money = sum/p;
		
		System.out.println(money);
		
		sc.close();
	}

}
