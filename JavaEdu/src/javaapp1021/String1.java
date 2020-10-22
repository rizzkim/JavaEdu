package javaapp1021;

public class String1 {

	public static void main(String[] args) {
//		String 클래스의 인스턴스 생성 
		String Identifier = "OrignalApex";
		
//		2번째 문자열 출력 
		char ch = Identifier.charAt(2);
		System.out.println(ch);
		
//		문자열의 길이 출력
		int len = Identifier.length();
		System.out.printf("문자열길이: %d\n", len);
		
//		문자 1개씩 출력 
		for (int i=0; i<len; i=i+1) {
			char txt = Identifier.charAt(i);
			System.out.printf("%s\n", txt);
		}
		
		String msg = "Apex40dd";
		System.out.println(msg.indexOf("p"));
		System.out.println(msg.lastIndexOf("p"));
		System.out.println(msg.lastIndexOf("x"));

//		rv1 과 rv2 에 gmail이 포함되어있는지 판별 
//		대소문자는 구별하지 않는다		
		String rv1 = "ggangpae1@gMail.com";
		String rv2 = "ggangpae1@kakao.com";
		
		if(rv1.toLowerCase().indexOf("gmail",toLowerCase()) >= 0) {
			System.out.println("gmail이 있다");
		} else {
			System.out.println("gmail이 없다");
		}
		
		if(rv2.toLowerCase().indexOf("gmail",toLowerCase()) >= 0) {
			System.out.println("gmail이 있다");
		} else {
			System.out.println("gmail이 없다");
		}
		
	}

	private static int toLowerCase() {
		// TODO Auto-generated method stub
		return 0;
	}

}
