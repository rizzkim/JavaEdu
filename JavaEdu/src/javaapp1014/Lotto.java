package javaapp1014;

public class Lotto {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//배열 생성
		int [] saveNum = new int [6];
				
		//입력
//		outer: for(int i=0; i<saveNum.length; i=i+1) {
		for(int i=0; i<saveNum.length; i=i+1) {
			System.out.printf("%d번째 로또번호를 입력하세요(1~45까지입력할것): ", i+1);
			saveNum[i] = sc.nextInt();
			
			//입력값 오류 확인 : 1~45 까지만 받을것
			if (saveNum[i]>45 || saveNum[i]==0) {
				System.out.printf("%d을 입력하였습니다.\n",saveNum[i]);
				i=i-1;
				continue;
			}
			
			
			//중복확인
			for(int j=0; j<=i-1; j=j+1) {
				if(saveNum[j] == saveNum[i]) {
					System.out.println("중복된 값을 입력하였습니다.");
//					break outer;
					i=i-1;
					continue;
				}
			}
			//강사님
//			if(i>0) {
//				//중복된 데이터가 있는지 확인하기 위한 변수
//				boolean flag = false;
//				for(int j=0; j<=i-1; j=j+1) {
//					//데이터가 중복되었다면 flag를 true로 변경
//					if(saveNum[i] == saveNum[j]) {
//						flag = true;
//						break;
//					}
//				}
//				// 데이터가 중복되었다면
//				if(flag == true) {
//					System.out.printf("중복된 데이터 입니다\n");
//					i=i-1;
//					continue;
//				}
//			}
		}
		
		//선택 정렬
		for(int i=0; i<saveNum.length-1; i=i+1) {
			for(int j=i+1; j<saveNum.length; j=j+1) {
				if(saveNum[i]<saveNum[j]) {
					int temp = saveNum[i];
					saveNum[i] = saveNum[j];
					saveNum[j] = temp;
				}
			}
		}
		
		//입력받은 배열을 출력
		for (int temp:saveNum) {
			System.out.printf("%5d", temp);
		}
		System.out.printf("\n");
		
		sc.close();

	}

}
