package javaapp1027;

import java.util.regex.Pattern;

public class EmailReg {

	public static void main(String[] args) {
		String [] emails = {"rizz.kim@gmail.com","flydos.naver.com","amu_=guna82@haeboja.kr"};
		
		//위의 데이터의 이메일이 맞는지 체크
//		1. Java에서 정규식을 사용할 수 있는 클래스를 찾고 확인하는 방법을 검색
		Pattern p = Pattern.compile("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$");
		 
//		2. email정규식을 검색
//		자바스크립트형태로 검색되면 맨 앞의 /와 맨 뒤의 /는 제거
		for(String imsi : emails) {
			System.out.printf("%b\n", p.matcher(imsi).find());
		}
	}
}
