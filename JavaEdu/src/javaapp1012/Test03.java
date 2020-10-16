package javaapp1012;

public class Test03 {
	
	public static void main(String[] args) {
		for (int i=1; i<=5; i=i+1) {
			for	(int j=5; j>0; j=j-1) {
				if(i<j) {
					System.out.printf("j");
				}else {
					System.out.printf("*");
				}
			}
			System.out.printf("\n");
		}

	}

}
