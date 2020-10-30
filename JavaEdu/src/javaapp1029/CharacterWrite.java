package javaapp1029;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CharacterWrite {

	public static void main(String[] args) {
		try {
			
//			현재 날짜 및 시간을 갖는 인스턴스 생성
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String today = sdf.format(date);
			
//			기록할 파일 생성
			FileWriter fw = new FileWriter("../../"+today+".txt", true);
			
//			기록할 내용
//			작업내용과 작업시간을 파일에 기록하는 것을 로그를 기록한다 라고 합니다.
//			로그를 기록할 때 가장 일반적인 단위가 1일입니다.
			sdf = new SimpleDateFormat("yyyy-MM-dd (a)hh:mm:ss");
			String time = sdf.format(date);
			
			PrintWriter pw = new PrintWriter(fw);
			
//			기록
			pw.printf("%s\n", time);
			pw.flush();
			pw.close();
			fw.close();
			
		} catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.getMessage();
		}

	}

}
