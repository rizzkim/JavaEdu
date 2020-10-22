package javaapp1022;

public class StringFormat {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		//x:100 탭 y:200 형태로 출력하기
		String display = String.format("x:%d\ty:%d\n", x,y);
		System.out.printf(display);
		System.out.printf("x:%d\ty:%d", x, y);
		
	}

}
