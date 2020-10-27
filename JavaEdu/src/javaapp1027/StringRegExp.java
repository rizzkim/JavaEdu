package javaapp1027;

import java.util.regex.Pattern;

public class StringRegExp {

	public static void main(String[] args) {
//		String 한글 = "^마";
//		Pattern p = Pattern.compile("[가-힣]");	//한글이 들어간
//		Pattern p = Pattern.compile("^[가-힣]");	//한글로 시작하는
//		Pattern p = Pattern.compile("[a-z]");	//소문자만 들어간
//		Pattern p = Pattern.compile("[가-힣]{6}");	//한글이 6개
		Pattern p = Pattern.compile("^\\d{3}-\\d{3,4}-\\d{4}$");	//휴대폰번호 정규식
		
//		검사할 문자열 배열 생성
//		String [] ar = {"Longboard", "skate", "스게", "마인드보드샵", "AKA보드샵", "freestyle", "dancing"};
		String [] phone = {"010-1234-2222", "아담", "스케이트보드", "skate보드", "skateboard"};
		
//		for(String imsi : ar) {
//			System.out.printf("%b\n", p.matcher(imsi).find());
//		}
		for(String imsi : phone) {
			System.out.printf("%b\n", p.matcher(imsi).find());
		}
		
	}

}
