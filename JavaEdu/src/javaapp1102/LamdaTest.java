package javaapp1102;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorImpl implements Comparator<Singer>{

	@Override
	public int compare(Singer o1, Singer o2) {
		return o1.getScore()-o2.getScore();
	}
	
}

public class LamdaTest {

	public static void main(String[] args) {
//		Singer 3개의 값을 대입해서 저장
//		Singer 의 개수는 알 수 없음
		List<Singer> list = new ArrayList<Singer>();
		
//		데이터 삽입
		Singer singer = new Singer();
		singer.setNum(1);
		singer.setName("혁오");
		singer.setScore(90);
		list.add(singer);
		
		singer = new Singer(2, "장범준", 88);
		list.add(singer);
		
		singer = new Singer(3, "신용재", 97);
		list.add(singer);

//		score를 이용해서 오름차순 정렬 - 클래스 생성 이용
		
//		이 방식은 ComparatorImpl을 2개이상 만들어서 사용하는 경우 사용
		list.sort(new ComparatorImpl());
		
		for(Singer temp : list) {
			System.out.printf("%s\n", temp);
		}
		
		System.out.println("=====================================");
//		score의 내림차순 정렬 - anonymous class 이용
		
		list.sort(new Comparator<Singer>() {
			@Override
			public int compare(Singer o1, Singer o2) {
				return o2.getScore() - o1.getScore();
			}
		});
		
		for(Singer temp : list) {
			System.out.printf("%s\n", temp);
		}
		
		System.out.println("=====================================");
//		이름의 내림차순으로 정렬 - 람다
		Collections.sort(list,(singer1,singer2) -> singer1.getName().compareTo(singer2.getName()));
		for(Singer temp : list) {
			System.out.printf("%s\n", temp);
		}
		
		System.out.println("=====================================");
//		list의 모든 요소에게 System.out.println을 수행시킴
		list.forEach(System.out::println);
		
			
			
	}

}
