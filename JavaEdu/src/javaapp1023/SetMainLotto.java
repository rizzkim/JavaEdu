package javaapp1023;

import java.util.TreeSet;

public class SetMainLotto {

	public static void main(String[] args) {
//		1~45까지숫자를 중복없이 6개 입력받아서 정렬한 후 출력
		
//		1.입력받기 위한 스캐너 인스턴스 생성
		java.util.Scanner sc = new java.util.Scanner(System.in);
//		2.정수를 저장할 수 있는 TreeSet 인스턴스 생성
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		
//		3.TreeSet의 데이터가 6개보다 작으면 계속 수행
		while(lotto.size() < 6) {
			System.out.printf("1~45 사이의 숫자를 입력해주세요.\n");	
			int su = sc.nextInt();
			
//			1~45사이의 숫자인지 확인
			if(su < 1 || su > 45) {
				System.out.printf("1~45 사이의 숫자만 입력하세요!\n");
				continue;
			}
			
//			중복검사
			boolean r = lotto.add(su);
//			데이터가 중복되었다면
			if(r == false) {
				System.out.println("이미 입력된 번호입니다.\n");
			}
		}
		
		for(Integer data : lotto) {
			System.out.printf("%s\t", data);
		}
		
		
//		스캐너 종료
		sc.close();

	}

}
