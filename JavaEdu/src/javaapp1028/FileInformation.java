package javaapp1028;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileInformation {

	public static void main(String[] args) {
//		File 인스턴스 만들기
//		절대 경로를 사용하는 경우 Windows는 디렉토리 기호가 \ 인데 문자열로 입력할때는 \\로 입력해야합니다
//		\는 제어문자로 인식하기 때문입니다.
		File f= new File("/Users/a202.06/Desktop/java/JavaEdu/JavaEdu/src/javaapp1028/filetest.rtf");
//		파일의 존재여부
		if(f.exists()) {
			System.out.printf("파일이 존재함\n");
//			파일의 크기
			System.out.printf("파일 크기:%d\n", f.length());
//			파일의 마지막 수정 날짜
			System.out.printf("파일 수정 날짜:%d\n", f.lastModified());
//			마지막 수정 날짜를 yyyy년 mm월 dd일 형식으로 출력 
			Date date = new Date(f.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
			String result = sdf.format(date);
			System.out.printf("파일 수정 날짜:%s\n", result);
		} else {
			System.out.printf("파일이 존재하지 않습니다.");
		}
	}

}
