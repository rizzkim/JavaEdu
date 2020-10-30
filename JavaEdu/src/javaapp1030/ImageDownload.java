package javaapp1030;

import java.io.BufferedInputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageDownload {

	public static void main(String[] args) {
		try {
//			URL 생성
			URL url = new URL("https://static.wixstatic.com/media/1aac06_3f45778b4eb44d5392e001123daff48e~mv2_d_5472_3648_s_4_2.jpg/v1/crop/x_766,y_0,w_3648,h_3648/fill/w_800,h_800,al_c,q_85,usm_0.66_1.00_0.01/IMG_4766_JPG");
			
//			연결 객체 생성
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
//			옵션설정
			con.setConnectTimeout(30000);
			con.setUseCaches(false);
			
//			파일 다운로드를 받을 때는 BufferedInputStream 생성
			BufferedInputStream bis = new BufferedInputStream(con.getInputStream());
			
//			기록할 FileStream 생성
			PrintStream ps = new PrintStream("./A.jpg");
			
//			바이트 배열 단위로 읽어서 ps에 기록
			while(true) {
//				읽어올 크기의 배열을 생성
//				byte [] b = new byte[512];
				byte [] b = new byte[con.getContentLength()];
//				읽기
				int r = bis.read(b);
//				읽은게 없으면 종료
				if(r <= 0) {
					break;
				}
//				읽은 내용을 파일에 기록
				ps.write(b,0,r);
			}
			
			ps.flush();
			ps.close();
			bis.close();
			con.disconnect();
			
		} catch(Exception e) {
			System.out.printf("예외: %s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
