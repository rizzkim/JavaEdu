package practice1007;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("가격을 입력하세요");
		int price = sc.nextInt();
		int money = 1000;
		int coin1 = (money-price)/100;
		int coin2 = ((money-price)-coin1*100)/50;
		int coin3 = ((money-price)-coin1*100-coin2*50)/10;
	
		if (money > price){
			System.out.printf("100원%2d개, 50원%2d개, 10원%2d개", coin1, coin2, coin3);
		} else if (money < price) {
			System.out.println("어!? 이거 왜 천원이 넘냐..;");
		} else {
			System.out.println("응 이거 천원이야");
		}
		
		sc.close();
	}

}