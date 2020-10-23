package javaapp1023;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListMethod {

	public static void main(String[] args) {
//		문자열 ArrayList 생성 
		ArrayList <String> list = new ArrayList<String>();
		
//		데이터 추가 
		list.add("요한 크루이프");
		list.add("마르코 반바스텐");
		list.add("루드 글리트");
		list.add("패트릭 클라이베르트");
		list.add(3, "데니스 베르캄프");
		list.add("리오넬 메시");
		
//		데이터 개수 확인 
		System.out.printf("리스트 개수: %d\n", list.size());
		
//		리오넬 메시 삭제 
		list.remove("리오넬 메시");
		
//		전체를 순회해서 출력 
		for(String s : list) {
			System.out.printf("%s\n",s);
		}
		
//		데이터를 정렬 
		list.sort(new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});
		
//		정렬 
		System.out.println("==========오름차순=========");
		for(String s : list) {
			System.out.printf("%s\n",s);
		}
		
//		데이터를 정렬 
		list.sort(new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o2.compareToIgnoreCase(o1);
			}
		});
		
//		정렬 
		System.out.println("==========내림차순=========");
		for(String s : list) {
			System.out.printf("%s\n",s);
		}
		

	}

}
