package javaapp1013;

public class ArrayCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {"도영","영길","민수","지홍"};
		int [] score = new int[4];
		score[0] = 98;
		score[1] = 95;
		score[2] = 91;
		score[3] = 85;
		
		// 반복문을 사용하지 않고 인덱스만 이용해 출력
		// System.out.printf("이름은 %s이고 점수는 %d입니다 \n", names[0], score[0]);
		// System.out.printf("이름은 %s이고 점수는 %d입니다 \n", names[1], score[1]);
		// System.out.printf("이름은 %s이고 점수는 %d입니다 \n", names[2], score[2]);
		
		// 반복문을 사용하면 유지보수가 수월해짐
//		for (int i=0; i<3; i=i+1) {
//			System.out.printf("이름은 %s이고 점수는 %d입니다 \n", names[i], score[i]);
//		}
		
		// 3이라고 배열의 데이터 개수를 설정하는 부분을 수정
		// 배열의 속성을 설정
		// 데이터가 변경이 되어도 출력하는 부분을 수정할 필요가 없다
		
//		for (int i=0; i<names.length; i=i+1) {
//			System.out.printf("이름은 %s이고 점수는 %d입니다 \n", names[i], score[i]);
//		}
		
		// . 으로 접근하거나 [인덱스]로 데이터를 접근하게 되면 메모리를 한번 더 찾아가야 한다
		// 반복문 등에서 동일한 데이터를 여러번 . 이나 [ 인덱스] 를 이용해서 찾아가게 되면 비효율적
		// 이런 경우에는 이 데이터를 가까운 곳에 저장해두고 접근하는것이 좋다
		
		int len = names.length;
		for(int i=0; 1<len; i=i+1) {
			System.out.printf("이름은 %s이고 점수는 %d입니다 \n", names[i], score[i]);
		}
		
	}

}
