package javaapp1029;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;

public class ByteBuffer {

	public static void main(String[] args) {
		try {
//			절대 경로를 이용해서 파일에 기록할 수 있도록 PrintStream을 생성
			PrintStream pw = new PrintStream("/Users/a202.06/Documents/pstest.txt");
//			기록할 내용
			String msg = "프린트스트림테스트용 텍스트파일임당.";
			pw.print(msg.getBytes());
			pw.close();
			
			System.out.printf("기록 성공\n");
			
//			파일에서 버퍼를 이용해서 읽어오기
			BufferedInputStream bis = 
					new BufferedInputStream(
							new FileInputStream("/Users/a202.06/Documents/pstest.txt"));
//			데이터를 저장하기 위한 바이트 배열
			byte [] r = new byte[bis.available()];
//			읽기
			bis.read(r);
//			문자열로 변환해서 출력
			String str = new String(r);
			System.out.printf("%s\b", str);
			bis.close();
		}catch(Exception e){
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
