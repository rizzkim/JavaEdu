package javaapp1008;

public class Operator {

	public static void main(String[] args) {
		 
		int score = 59;
		// msg 라는 변수에 score가 60이상이면 합격 아니면 불합격
		String msg = score >= 60 ? "합격" : "불합격";
		System.out.println(msg);
		
		int a = 20;
		a *= 4;
		System.out.printf("a=%2d\n",a);
		
		// 다음 2개 변수의 값을 교환하기
		// 데이터가 여러 개 있을때 순서대로 나열하기 위해 자주 수행 - swap
		int n1 = 30;
		int n2 = 20;
		
		int save = n1;
		n1 = n2;
		n2 = save;
		
		System.out.printf("n1:%3d\t n2:%3d\n", n1, n2);

	}

}
