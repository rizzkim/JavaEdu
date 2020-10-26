package javaapp1026;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
//		1부터 45사이의 랜덤한 정수를 출력
		Random r = new Random();
		
//		0-44까지 리턴되므로 + 1
		int result = r.nextInt(45)+1;
		System.out.println(result);

	}

}
