package javaapp1026;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javaapp1026.Boards;

public class BoardsMain {

	public static void main(String[] args) {
//		boards 인스턴스 1개를 생성하고 값을 설정 
		Boards boards = new Boards();
		boards.setIdxNum(1);
		boards.setBrand("bastle");
		boards.setProduct("walzer");
		boards.setLength(50);
		boards.setWidth(9.4);
		boards.setPrice(320000);
		
//		boards = new Boards();
//		boards.setIdxNum(2);
//		boards.setBrand("bastle");
//		boards.setProduct("bolero");
//		boards.setLength(44.5);
//		boards.setWidth(9);
//		boards.setPrice(280000);
		
//		boards 인스턴스의 값을 각각 출력 - DTO
		/*
		System.out.printf("번호:%d 브랜드:%s 제품명:%s 길이:%.1f 폭:%.1f 가격:%d",
				boards.getIdxNum(), boards.getBrand(), boards.getName(), boards.getLength(), boards.getWidth(), boards.getPrice());
		*/
		
//		DTO 대신 사용하는 MAP 
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("IdxNum", 1);
		map.put("Brnad", "bastle");
		map.put("Product", "walzer");
		map.put("Length", 44.5);
		map.put("Width", 9);
		map.put("Price", 320000);
		
		Set<String> keySet = map.keySet();
		
		for(String key : keySet) {
			System.out.printf("%s:%s\n", key, map.get(key));
		}
		

	}

}
