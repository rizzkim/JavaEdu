package javaapp1013;

public class DescriptiveStatistics {

	public static void main(String[] args) {
		//이름 배열
		String [] names = {"아현","이대","신촌","홍대","합정","당산"};
		//정수 배열
		int [] nums = {68,79,82,85,87,94};
		
		//50점이 넘는 데이터의 합계와 개수 그리고 평균 구하기
		//평균은 소수 첫째자리까지 구하기 - 소수두째자리에서 반올림
		
		//합계를 저장할 변수와 개수를 구할 변수를 생성
		int sum = 0;
		int cnt = 0;
		
		for (int a=0; a<nums.length; a=a+1) {
			if (nums[a]>50) {
				sum=sum+nums[a];
				cnt=cnt+1;
				
				
			}
			
		}
		System.out.printf("50점이 넘은 수의 합계 : %d\n", sum);
		System.out.printf("50이 넘는 개수 : %d\n", cnt);
		
		if(cnt==0) {
			System.out.println("조건에 맞는 데이터가 없습니다.");
		} else {
			double avg = (double)sum/cnt;
			System.out.printf("평균 : %.1f\n", avg);
		}
		
		//최대값과 최소값 구하기
		//최대값을 저장할 변수를 생성 - 아주 작은 값이나 배열의 첫번째 값으로 초기화
		int max = 0;
		//최소값을 저장할 변수를 생성 - 아주 큰 값이나 배열의 첫번째 값으로 초기화
		int min = 100;
		//배열을 순회하면서 max나 min보다 큰 값이나 작은 값을 만나면 그 값으로 교체
		for(int num : nums) {
			if(max<num) {
				max = num;
			}
			if(min>num) {
				min = num;
			}
		}
		System.out.printf("최대값:%d\n",max);
		System.out.printf("최소값:%d\n",min);
		
		
		//num이 가장 높은 name을 찾기
		//가장 높은 num을 저장하기 위한 변수
		int maxNum = 0;
		int minNum = 100;
		//가장 높은 num의 name을 저장할 변수
		String maxName = "";
		String minName = "";
		//배열을 순회하면서 빠른열거를 사용하지 않은 이유는 2개의 배열을 이용하기 때문
		for(int i=0; i<nums.length; i=i+1) {
			//i번째 num을 num에 대입
			int num = nums[i];
			String name = names[i];
			//배열안의 값과 최대값을 비교해서 배열안의 값이 최대값보다 크면 최대값을 배열 안의 값으로 변경
			if(maxNum < num) {
				maxName = name;
				maxNum = num;				
			}
			
			if(minNum > num) {
				minName = name;
				minNum = num;				
			}
		}
		
		
		System.out.printf("가장 큰 장소 : %s\t 큰값:%d\n", maxName, maxNum);
		System.out.printf("가장 작은 장소 : %s\t 작은값:%d\n", minName, minNum);
		
		//num이 80에 가장 가까운 데이터와 그 데이터의 name을 조회
		//가까운 데이터를 찾을 때는 차이가 제일 적은 데이터를 찾아야 한다
		//차이는 음수가 없다
		//모든 데이터의 차이를 구해서 그 차이가 최소인 데이터를 찾아야 한다
		//스마트폰 애플리케이션 등에서 가까운 곳 찾기에 많이 사용
		
		//차이가 가장 작은 값을 저장할 변수
		int minDistance = 100;
		//차이가 가장 작은 이름을 저장할 변수
		String minDesName="";
		
		for(int i=0; i<nums.length; i=i+1) {
			//i번째 num을 num에 대입
			int num = nums[i];
			String name = names[i];
			
			//80 과 score의 차이를 구해야 합니다.
			int distance = num - 80;
			//거리는 음수가 없기 때문에 음수가 나오면 -1을 곱해서
			//양수를 만들어야 합니다.
			if(distance < 0) {
				distance = distance * -1;
			}
			
			//distance가 가장 작은 데이터 찾기
			if(minDistance>distance) {
				minDistance = distance;
				minDesName = name;
			}
		}
		
		System.out.printf("80에 가까운 이름 : %s\n", minDesName);
		
	}

}
