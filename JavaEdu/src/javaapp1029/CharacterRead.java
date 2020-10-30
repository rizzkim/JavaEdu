package javaapp1029;

import java.io.BufferedReader;
import java.io.FileReader;

public class CharacterRead {

	public static void main(String[] args) {
		try {
//			파일을 문자열 단위로 읽을 수 있는 인스턴스를 생성
			BufferedReader br = new BufferedReader(new FileReader("/Users/a202.06/Desktop/brtemp.txt"));
			StringBuilder sb = new StringBuilder();	//안드로이드에서 많이 사용하는 방법
			while(true) {
//				못 읽으면 null을 리턴
				String line = br.readLine();
//				읽은게 없으면 종료
				if(line==null) {
					break;
				}
				sb.append(line+"\n");	//안드로이드에서 많이 사용하는 방법
			}
			String msg=sb.toString();	//안드로이드에서 많이 사용하는 방법
			System.out.printf("%s", msg);
			br.close();
		} catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.getMessage();
		}

	}

}
