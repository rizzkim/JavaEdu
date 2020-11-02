package javaapp1102;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class CollectionAccess {

	public static void main(String[] args) {
//		문자열 리스트 생성
		List<String> boarders = new ArrayList<String>();
		
		boarders.add("권도영");
		boarders.add("조종빈");
		boarders.add("로피");
		boarders.add("바클리");
		boarders.add("김효진");
		boarders.add("이수빈");
		
//		반복문을 전체 데이터 출력
//		데이터의개수를 리턴하는 메소드와 1개의 데이터를 가져오는 메소드를 찾아야합니다.
		int len = boarders.size();
		for(int i=0; i<len; i=i+1) {
			System.out.printf("%15s", boarders.get(i));	
		}
		System.out.printf("\n");
		
//		Iterator 이용
		Iterator <String> iterator = boarders.iterator();
//		다음 데이터가 존재한다면 출력
		while(iterator.hasNext()) {
			System.out.printf("%15s", iterator.next());
		}
		System.out.printf("\n");
		
//		빠른열거
		for(String temp:boarders) {
			System.out.printf("%15s", temp);
		}
		System.out.printf("\n");
		
//		스트림 이용
		Stream <String> stream = boarders.stream();
		stream.forEach(name->System.out.printf("%15s",name));

	}

}
