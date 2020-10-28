package javaapp1028;

import java.util.ArrayList;

public class Product {
//	공유자원으로 사용할 List
	private ArrayList<Character> list;
	
//	생성자 - List 생성
	public Product() {
		list = new ArrayList<Character>();
	}
	
//	list에 문자를 대입하는 메소드 - 생산자가 사용할 메소드
	public void put(Character ch) {
		list.add(ch);
		System.out.printf("창고에 제품 %c 가 입고되었습니다.", ch);
		try {
			Thread.sleep(1000);
		} catch(Exception e) {};
		System.out.printf("재고 수량: %d\n", list.size());
	}
	
//	list에서 데이터를 1개 제거해서 리턴하는 메소드
	public Character get() {
		Character ch = list.remove(0);
		System.out.printf("창고에서 %c 를 줄고 \n", ch);
		System.out.printf("재고수량: %d\n", list.size());
		return ch;
	}
}
