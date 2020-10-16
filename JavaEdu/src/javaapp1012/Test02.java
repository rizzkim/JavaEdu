package javaapp1012;

public class Test02 {

	public static void main(String[] args) {
		// 구구단
		
		for(int x=1; x<=9; x=x+1) {
			for(int y=2; y<=9; y=y+1) {
				System.out.printf("%d * %d = %d\t", y,x,x*y);
			}
			System.out.println();
		}

	}

}
