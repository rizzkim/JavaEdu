package javaapp1012;

public class Test01 {

	public static void main(String[] args) {
		// 2개의 주사위를 던져서 주사위 눈의 합계가 6이 되는 모든 경우를 출력
		
		for (int x=1; x<=6; x=x+1) {
			for (int y=1; y<=6; y=y+1) {
				int sum=x+y;
				if (sum==6) {
					System.out.printf("주사위x=%d 주사위y=%d\n",x,y);
				}
			}
		}
	}

}
