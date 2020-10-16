package practice1007;

public class Unary {

	public static void main(String[] args) {
		
		boolean result = true;
		int x = 10;
		
		// !을 붙이면 반대로 결과를 리턴한다.
		System.out.println("!result= " + (!result));
		
		// 증감 연산자 사용
		x++;
		System.out.println("x++= " + x);
	
		// 앞에다 붙이면 증감을 먼저 하고 명렁어에 사용
		System.out.println(++x);
		
		// 명령어 사용을 하고 증감을 수행
		System.out.println(x++);
		
		System.out.println(x);
		
	}

}
