package javaapp1020;

import java.io.IOException;

public class RuntimePractice {

	public static void main(String[] args) throws RuntimeException{
		// Runtime 인스턴스 생성 
		Runtime rt = Runtime.getRuntime();
		// Runtime 의 exec 메소드는 예처리를 강제합니다.
		// 예외처리 구문으로 감싸서 실행해야 합니
		try {
			rt.exec("open /System/Applications/TextEdit.app");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
