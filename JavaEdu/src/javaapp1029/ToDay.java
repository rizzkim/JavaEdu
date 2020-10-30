package javaapp1029;

import java.text.SimpleDateFormat;

public class ToDay {

	public static void main(String[] args) {
		java.util.Date date = new java.util.Date();
//		2020-10-29 형태의 문자열을 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(date);
		System.out.printf("%s\n", today);
		
		java.sql.Date t = new java.sql.Date(System.currentTimeMillis());
		System.out.printf("%s\n", t);
	}

}