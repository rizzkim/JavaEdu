package javaapp1022;

public class FastEnumerationTest {

	public static void main(String[] args) {
		String [] skateBrand = {"오리지널", "로디드", "바슬", "레인","퀸보드", "랜디야츠"};
		
//		위의 내용을 순서대로 줄 단위로 출력 
//		index를 이용하는 방법 
		int len = skateBrand.length;
		for (int i=0; i<len; i=i+1) {
			System.out.printf("%s\n", skateBrand[i]);
		}
		
//		빠른 열거를 이용한 방법 
		for (String imsi : skateBrand) {
			System.out.printf("%s\n", imsi);
		}
	}

}
