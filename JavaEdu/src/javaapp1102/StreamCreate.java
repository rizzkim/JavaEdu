package javaapp1102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreate {
	public static void main(String[] args) {
//		문자열 배열 생성
		String [] names = {"축구", "농구", "배구", "탁구", "족구"};
		
		List<String> list = new ArrayList<String>();
		list.add("김연아");
		list.add("이상화");
		list.add("신준섭");
		list.add("한송이");
		list.add("김연경");
		
		Stream <String> st1 = Arrays.stream(names);
		st1.forEach(System.out::println);
		
		Stream <String> st2 = list.stream();
		st2.forEach(System.out::println);
	}
}
