package javaapp1102;

import java.util.stream.Stream;

public class FilterMain {
	public static void main(String[] args) {
//		공유데이터 strList를 전부 출력
		Stream<String> st1= Singleton.sharedInstance().getStrList().stream();
		
//		st1.forEach(System.out::println);
//		중복제거
//		st1.distinct().forEach(System.out::println);
		
//		중복제거하고 2개 건너뛰고 출력
//		st1.distinct().skip(2).forEach(System.out::println);
		
//		filter는 매개변수가 1개이고 리턴 타입이 boolean인 함수를 대입
//		st1.filter(it -> it.length()>6).forEach(System.out::println);
		
//		문자열을 포함한 리스트만 출력
		st1.filter(it->it.indexOf("N")>=0).forEach(System.out::println);
		
//		student의 list를 stream으로 생성
		Stream <Student> st2 = Singleton.sharedInstance().getStudentList().stream();
		
		st2.filter(it -> it.getGender().equals("남자")).forEach(System.out::println);
		
	}
}
