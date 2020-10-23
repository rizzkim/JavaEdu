package javaapp1023;

import java.util.HashSet;

public class SetMain {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("JavaScript");
		set.add("Swift");
		set.add("Kotlin?");
		set.add("C#");
//		중복된 데이터는 저장하지 않음 
		set.add("JavaScript");
		
//		전체 출력 
		System.out.printf("%s\n", set);
//		하나씩 순차접근
		for(String language : set) {
			System.out.printf("%s\n", language);
		}
	}

}
