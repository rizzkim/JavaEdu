package javaapp1022;

public class StringBuilderTest {

	public static void main(String[] args) {
//		비어있는 StringBuilder 클래스의 인스턴스를 생성 
		StringBuilder sb = new StringBuilder();
		
//		문자열 추가 
		sb.append("오리지날");
		sb.append("스케이트");
		
//		sb의 내용을 갖는 String 인스턴스를 생성 
		String txt = sb.toString();
		System.out.printf("%s\n",txt);
		
//		한글자씩 줄단위로 출력 
		int len = txt.length();
		for (int i=0; i<len; i=i+1) {
			char ch = txt.charAt(i);
			System.out.printf("%c\n", ch);
		}
	}

}
