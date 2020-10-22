package javaapp1022;

class Generic<T>{
	private T data[];
//	숫자는 = 0, boolean = false, 둘다 아닌자료형은 null로 초기화됩니다. 
//	null은 대입된 인스턴스가 없다는 뜻입니다. 
	
//	매개변수가 있는 생성자 
//	데이터를 개수에 상관없이 대입이 가능 : ... 
	public Generic(T...n) {
		data = n;
	}
	
	public void disp() {
		for(T imsi : data) {
			System.out.printf(imsi + "\t");
		}
		System.out.printf("\n");
	}
}

//SOUTH, NORTH, WEST, EAST 만을 갖는 자료형을 생성 
enum Direction {
	SOUTH, NORTH, WEST, EAST;
}


public class GenericTest {

	public static void main(String[] args) {
		Direction direction = Direction.EAST;
		
		Generic <String> g1 = new Generic<String>("마인드보드", "AKA보드");
//		인스턴스를 이용해서 disp 호출 
		g1.disp();
		
		Generic <Integer> g2 = new Generic<Integer>(62, 28, 49);
//		인스턴스를 이용해서 disp 호출 
		g2.disp();
	}

}
