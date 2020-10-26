package javaapp1026;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UseMapMain {

	public static void main(String[] args) {
//		키와 값을 쌍으로 저장하는 자료구조 인스턴스 생성 
		Map<String, Object> map = new HashMap<String, Object>();
//		데이터 저장
		map.put("name", "walzer");
		map.put("length", 49);
//		기존에 존재하는 Key를 사용하면 수정
		map.put("length", 50);
		
//		전체 데이터 확인
		System.out.printf("%s\n", map);
		
//		하나의 값을 가져오기 
		System.out.printf("%s\n", map.get("name"));
		
//		존재하지 않는 key값을 가져오 null
		System.out.printf("%s\n", map.get("brand"));
		
//		데이터 삭제
//		map.remove("name");
		map.put("name", null);	// name에 nul이 대입
//		이 경우는 key만 남아있음.
		
//		전체 데이터 확인
		System.out.printf("%s\n", map);
		
//		전체 데이터 순회
//		모든 key의 값을 가져오기
		Set<String> keySet = map.keySet();
//		set을 순회
		for(String key : keySet) {
			System.out.printf("%s:%s\n", key, map.get(key));
		}
	}
}
