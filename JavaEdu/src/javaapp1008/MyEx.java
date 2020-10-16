package javaapp1008;

public class MyEx {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.printf("가격입력 : ");
		int price = sc.nextInt();
		System.out.printf("받은돈 입력 : ");
		int money = sc.nextInt();
		
		System.out.printf("%d원이고, %d원 받았습니다.\n", price, money);
		
		int coin1 = (money-price)/1000;
		int coin2 = (money-price)%1000/500;
		int coin3 = ((money-price)-coin1*1000)%500/100;
		int coin4 = ((money-price)-coin1*1000-coin2*500)%100/50;
		int coin5 = ((money-price)-coin1*1000-coin2*500-coin3*100)%50/10;
	
		if (money > price) {
			System.out.printf("거스름돈은 1000원%2d장, 500원%2d개, 100원%2d개, 50원%2d개, 10원%2d개", coin1, coin2, coin3, coin4, coin5);
		} else if (money < price) {
			System.out.println("더 주세요");
		} else {
			System.out.println("안녕히 가세요");
		}
		
		sc.close();

	}

}
