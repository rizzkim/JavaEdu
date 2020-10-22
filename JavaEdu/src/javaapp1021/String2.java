package javaapp1021;

public class String2 {

	public static void main(String[] args) {
		String str = "web/update/123";
//		마지막 / 다음에 있는 123을 추출해서 정수로 변환해서 출력 
//		String 의 메소드와 문자열을 숫자로 변환하는 메소드를 이용 
		int i = str.lastIndexOf("/");
		String txt = str.substring(i+1);
		System.out.printf("%d\n", Integer.parseInt(txt));
		
//		split 이용 (강사님풀이)
		String [] ar = str.split("/");
		int i2 = Integer.parseInt(ar[ar.length-1]);
		System.out.printf("%d\n", i2);
	
//		password에서 대문자의 개수 구하기
		String password = "Dokki1000Dki!";
		int len = password.length();
		int upperCnt = 0;
		for (int j=0; j<len; j=j+1) {
			char cNum = password.charAt(j);
			if(cNum>='A' && cNum<='Z') {
				upperCnt = upperCnt+1;
			}	
		}
		System.out.printf("대문자의 개수: %d\n", upperCnt);
		
//		password에서 대문자도 아니고 소문자도 아니고 숫자도 아닌 데이터의 개수구하기 
		int etcCnt = 0;
		for (int j=0; j<len; j=j+1) {
			char cNum = password.charAt(j);
			if(!(cNum>='A' && cNum<='Z' || 
				cNum>='a' && cNum<='z' || 
				cNum>='0' && cNum<='9')) {
				etcCnt = etcCnt+1;
			}	
		}
		System.out.printf("특수문자의 개수: %d\n", etcCnt);

	}

}
