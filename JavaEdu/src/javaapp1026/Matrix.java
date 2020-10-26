package javaapp1026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Matrix {

	public static void main(String[] args) {
//		여자 배구 선수 명단을 저장
//		여자 배구는 팀별로 분할되어 있습니다.
		String [] 도로공사 = {"배유나", "문정원", "전새얀"};
		String [] 인삼공사 = {"한송이", "다우프", "정호영"};
		String [] 지에스 = {"안혜진", "강소휘", "이소영"};
		String [] 흥국생명 = {"김연경", "이재영"};
		
//		2차원 배열로 생성
//		2차원 배열은 각 배열의 데이터가 변경이 되는경우 아무런 문제가 없을 가능성이 높다
//		2차원 배열에 1차원 배열이 추가되면 문제가 발생할 가능성이 높다 
//		배열을 의미하는 데이터와 배열을 같이 저장하지 않기 때문
		
		String [][] kovo = {도로공사, 인삼공사, 지에스, 흥국생명};
		
//		2차원 배열 출력
		for(int i=0; i<kovo.length; i=i+1) {
			String [] volley = kovo[i];
			if(i == 0) {
				System.out.printf("%-10s", "도로공사\t:");
			} else if(i == 1) {
				System.out.printf("%-10s", "인삼공사\t:");
			} else {
				System.out.printf("%-10s", "지에스\t:");
			}
			
			for(int j=0; j<volley.length; j=j+1) {
				System.out.printf("%10s", volley[j]);
			}
			System.out.printf("\n");
		}
//		테이블 구조의 데이터를 만들때는 배열과 배열의 의미를 포함하는 데이터를 
//		하나의 묶음으로 만들어 이 묶음 데이터의 배열을 생성해야 한다
		Map<String, Object>map1 = new HashMap<String, Object>();
//		팀 이름을 저장
		map1.put("팀명", "도로공사");
//		선수 명단 배열을 저장
		map1.put("선수", 도로공사);
		
		Map<String, Object>map2 = new HashMap<String, Object>();
		map2.put("팀명", "인삼공사");
		map2.put("선수", 인삼공사);
		
		Map<String, Object>map3 = new HashMap<String, Object>();
		map3.put("팀명", "지에스");
		map3.put("선수", 지에스);
		
//		Map의 배열을 생성
		ArrayList<Map<String, Object>> players = new ArrayList<Map<String, Object>>();
		
//		데이터 삽입
		players.add(map1);
		players.add(map2);
		players.add(map3);
		
//		새로운 데이터 생성
		Map<String, Object> map4 = new HashMap<String, Object>();
		map4.put("팀명", "흥국생명");
		map4.put("선수", 흥국생명);
		players.add(map4);
		
//		출력하기
		for(Map<String, Object> map : players) {
//			팀 이름을 출력 - 형 변환 없이 바로 출력
			System.out.printf("%s\t:", map.get("팀명"));
//			선수 명단을 가져오기 - 사용할 때는 원래의 자료형으로 반드시 형변환 수행
			String [] player = (String [])map.get("선수");
//			선수 명단 출력
			for(String imsi : player) {
				System.out.printf("%10s", imsi);
			}
			System.out.printf("\n");	
		}

	}
}
