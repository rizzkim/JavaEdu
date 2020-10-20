package javaapp1020;

public class BubbleSort {

	public static void main(String[] args) {
		//배열 생성
		int [] ar = {20, 34, 17, 26, 22};
		int n = ar.length;
		
		// bubble sort
		// 데이터 순서 정렬
		for(int i=0; i<n-1; i=i+1) {
			for(int j=0; j<n-i-1; j=j+1) {
				if(ar[j]>ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
				
			}
			
		}
		
		//결과 출력
		for (int temp : ar) {
			System.out.printf("%5d", temp);
		}
		
		

	}

}
