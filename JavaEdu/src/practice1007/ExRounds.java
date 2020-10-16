package practice1007;

public class ExRounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money =37000;
		int man = money/10000;
		int half = (money-man*10000)/5000;
		int thou = (money-man*10000-half*5000)/1000;
		
		System.out.println(money);
		System.out.println(man);
		System.out.println(half);
		System.out.println(thou);
	}

}
