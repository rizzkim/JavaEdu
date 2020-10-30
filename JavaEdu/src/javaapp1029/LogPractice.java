package javaapp1029;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LogPractice {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("./JavaEdu/src/javaapp1029/log.txt"));
//			System.out.printf("%s\n", br);
			
//			ip주소를 저장하기 위한 set 생성
			Set<String> ipSet = new HashSet<String>();
			ArrayList<String> ipList = new ArrayList<String>();
//			트래픽의 합계를 저장할 변수
			int sum = 0;
			
			while(true) {
				String line = br.readLine();
				if(line==null) {
					break;
				}
				System.out.printf("%s\n", line);
//				공백을 기준으로 라인을 분할
				String [] ar = line.split(" ");
//				제데로 분할되었는지 확인
				System.out.printf("%s\n", ar[0]);


			}
			
//			Set은 중복된데이터를 저장하지 않음
			System.out.printf("컴퓨터 개수 : %d\n", ipSet.size());
			System.out.printf("트래픽의 합 : %d\n", sum);
			
			br.close();
		} catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.getStackTrace();
		}

	}

}
