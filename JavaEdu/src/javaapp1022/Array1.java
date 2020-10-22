package javaapp1022;

import java.util.Arrays;
public class Array1 {
	public static void main (String[] args) {
//		배열 생성 
		String [] names = {"아펙스","방그라","호다운","토투가","왈쳐"};
		
//		정렬하는 메소드
		Arrays.sort(names);
		
		int loc = Arrays.binarySearch(names, "왈쳐");
		System.out.printf("왈쳐: %d번째\n", loc);
		
//		코즈모 위치찾기 
		loc = Arrays.binarySearch(names, "코즈모");
		System.out.printf("코즈모: %d번째\n", loc);
	}
}
