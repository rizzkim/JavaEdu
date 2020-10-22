package javaapp1021;

public class TodayEx {

	public static void main(String[] args) {
		String data = "GDNDFGCCGGKDLGCCGCCGJKDCGCCGFD";
		//위의 문자열에서 GCCG가 존재하는 곳의 시작위치를 전부 출력하시오.
		//단 한 번 조회된 영역은 다시 조회하지 않도록 하시오.
		//메소드는 length와 charAt만 사용하시오.
		int tempG = 0;
		
		for(int i=0; i<data.length(); i=i+1) {
			char g = data.charAt(i);
			if( g == 'G') {
				tempG = tempG+1;
				System.out.println(g);
			}
		}
		
//		System.out.println(tempG);
//		System.out.println(tempGC);
		
		
		
		

	}

}
