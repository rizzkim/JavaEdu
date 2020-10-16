package practice1006;

public class Ex {

	public static void main(String[] args) {
		// 데이터 생성
		int rank1 = 1;
		String name1 = "이미래";
		int win1 = 6;
		int lose1 = 4;
		double avg1 = 0.957;
		int highrun1 = 6;
		
		int rank2 = 2;
		String name2 = "김가영";
		int win2 = 6;
		int lose2 = 4;
		double avg2 = 0.911;
		int highrun2 = 8;
		
		
//		업무 처리
		
//		화면 출력
		System.out.printf("%-5s%-10s%-4s%-4s%-7s%s\n","순위","이름","승","패","평균","HR");
		System.out.printf("%-3d%-10s%3d%3d%5.1f%3d\n", rank1, name1, win1, lose1, avg1, highrun1);
		System.out.printf("%-3d%-10s%3d%3d%5.1f%3d\n", rank2, name2, win2, lose2, avg2, highrun2);
		
	}

}
