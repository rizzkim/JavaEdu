package javaapp1023;

import java.util.ArrayList;
import java.util.Comparator;

public class LinkedListMain {

	public static void main(String[] args) {
//		String을 저장하는 LinkedList를 생성 
		ArrayList <String> list = new ArrayList<String>();
		
//		데이터 추가 
		list.add("로디드 방그라");
		list.add(0, "랜디야츠 스트라투스");
		list.add("오리지날 아펙스");
		list.add("바슬 왈쳐");
		list.add("얼터너티브 오스트리치");
		list.add("마주쯔 오도리");
		
//		데이터 삭제
		list.remove(3);
		
//		데이터 정렬
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
		
//		전체 출력
		for(String s : list) {
			System.out.printf("%s\n", s);
		}
		
		
	}

}
