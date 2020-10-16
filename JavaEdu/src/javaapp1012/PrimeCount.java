package javaapp1012;

public class PrimeCount {

	public static void main(String[] args) {
		// 2~1000까지 소수의 개수 구하기
		// 소수는 2부터 자신의 절반이 되는 숫자까지 나누어 떨어지지 않으면 소수
		
		// 개수를 구할 변수를 생성
		int cnt = 0;
		// 2부터 1000까지 1씩 증가하면서 수행
		for (int i=2; i<1001; i=i+1) {
			boolean flag=false;
			for(int j=2; j<=i/2; j=j+1) {
				// 나누어 떨어지는지 확인
				if(i%j == 0) {
					// 나누어 떨어지면 변수의 값을 변경
					flag=true;
					break;
				}
			}
			// 나누어 떨어졌는지 판별
			// true로 변경되지 않았다면 나누어 떨어진 적이 없음
			if(flag == false) {
				cnt = cnt+1;
			}
		}
		
		//개수 출력
		System.out.printf("소수 개수: %d 개\n", cnt);
		
	}

}
