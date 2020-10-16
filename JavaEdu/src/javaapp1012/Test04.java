package javaapp1012;

public class Test04 {

	public static void main(String[] args) {
		// 2~1000까지 완전수의 개수 구하기
		// 완전수는 자기 자신을 제외한 약수의 합이 자기 자신과 동일한 숫자를 완전수라고 한다
		// 1부터 자신의 절반이 되는 숫자까지 나누어서 나누어 떨어지는 숫자의 합을 계산하여 자기 자신과 비교해서 구합니다.
		// 개수를 구할 변수를 생성
		int cnt = 0;
		// 2부터 1000까지 1씩 증가하면서 수행
		for (int i=2; i<1001; i=i+1) {
			int sum = 0;
			for(int j=1; j<=i-1; j=j+1) {
				// 나누어 떨어지는지 확인
				if(i%j == 0) {
					sum = sum+j;
				}
			}
			if(i == sum) {
				cnt = cnt+1;
			}
		}
		
		//개수 출력
		System.out.printf("소수 개수: %d 개\n", cnt);
		
	}

}
