package practice1007;

public class Ex01 {
	public static void main(String[] args) {
		//초를 받아서 몇 시간 몇 분 몇 초인지 출력하기
		int s = 4700;
		int hour = s/3600;
		int minute = (s%3600)/60;
		int second = s%60;
		System.out.printf("%2d시간 %2d분 %2d초", hour, minute, second);
	}
}
