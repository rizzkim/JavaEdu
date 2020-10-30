package javaapp1030;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTMLDownload {

	public static void main(String[] args) {
		try {
//			URL 생성
			URL url = new URL("http://chunchu.yonsei.ac.kr/rss/allArticle.xml");
			
//			연결 객체 생성
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
//			옵션 설정
			
//			접속 시도 시간을 설정
//			캐시 사용 여부를 설정
			con.setConnectTimeout(30000);
			con.setUseCaches(false);
			
//			전송방식이 POST 라면 setRequestMethod 호출
			
//			문자열 다운로드이면 BufferedReader를 만들고, 
//			파일 다운로드이면 BufferedInputStream을 생성
			BufferedReader br = new BufferedReader(
					new InputStreamReader(con.getInputStream()));
			
			StringBuilder sb = new StringBuilder();
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				sb.append(line+"\n");
			}
			String content = sb.toString();
			
			System.out.printf("%s", content);
			
//			정리작업
			br.close();
			con.disconnect();
			
		} catch(Exception e) {
			System.out.printf("예외: %s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
