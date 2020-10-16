package practice1007;

public class Arithmetic {

	public static void main(String[] args) {
		
		// int보다 작은 자료형으로 연산하면 int로 변경해서 수행
		byte b1 = 10;
		byte b2 = 20;
		// 형변환하지 않으면 에러. 작은 자료형의 변수에 큰 자료형의 데이터 저장 불가
		// byte<short<int<long<float<double
		byte result = (byte)(b1 + b2);
		
		System.out.println("result= "+ result);
		
		// 동일한 자료형끼리 연산을 하면 결과도 같은 자료형으로 리턴
		System.out.println("result= "+ (10/4));
		
		// 서로다른 자료형끼리 연산을 하면 더 큰 크기의 자료형으로 변환해서 연산을 수행
		System.out.println("result= "+ (10.0/4));
		
		
		int score1 = 20;
		int score2 = 30;
		int score3 = 30;
		
		double avg = ((double)score1+score2+score3)/3;
		// 소수 2째 자리에서 반올림 공식
		 avg=((int)(avg*10 + 0.5))/10.0;
		
		// 3개 데이터의 평균을 소수 1째 자리까지 구하기
//		System.out.printf("%.1f", avg);
		System.out.println(avg);
	}

}
