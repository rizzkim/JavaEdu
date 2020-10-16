package javaapp1015;

public class PracticeMain {

	public static void main(String[] args) {
		//Practice 인스턴스 만들기
		Practice p1 = new Practice();
		Practice p2 = new Practice();
		
		//Hello Java를 3번 출력
		p1.disp();
		
		//Hello Kotlin을 출력
		System.out.println("Hello Kotlin");
		
		//Hello Java를 3번 출력
		p1.print(3);
		
		//Practice 클래스에 있는 add함수를 호출
		//인스턴스 생성
		Practice p3 = new Practice();
		//정수 매개변수 2개를 요구하무로 2개를 대입
		p3.add(5, 7);
		//위의 경우 return 되는 데이터가 없기 때문에 이 결과를 가지고 다른 작업을 수행할 수 없다.
		
		int r = p3.addReturn(30, 20);
		System.out.println(r);
		
		//return 받은 결과가 있으므로 이결과를 가지고 다음 작업에 이용이 가능
		r = p3.addReturn(r, 50);
		System.out.println(r);
		
		//static메소드
		Practice.init();
		
		
		//Math 클래스에는 0.0에서 1.0사이의 랜덤한 숫자를 생성해주는 메소드가 존재
		//이 메소드의 원형은 아래와 같다
		//static double random();
		double  random = Math.random();
		System.out.printf("%f\n", random);
		
		//Math 크래스에는 실수를 소수 첫째 자리에서 반올림 해주는 아래와 같은 함수가 존재합니다
		//이 함수를 이용해서 6.78을 소수 첫째 자리에서 반올림해서 출력하기
		//static long round(double a)
		long r1  = Math.round(6.78);
		System.out.printf("%d\n", r1);
		
		//Scope의 법칙
		for(int i=0; i<10; i=i+1) {
			for(int j=0; j<10; j=j+1) {
				if (j>5) {
					break; //j를 만든 반복문을 종료합니다
				}
			}
		}
		
		Outer: for(int i=0; i<10; i=i+1) {
			for(int j=0; j<10; j=j+1) {
				if (j>5) {
					break Outer; //j를 만든 반복문을 종료합니다
				}
			}
		}
		
		//this
		p3.thisCheck(5);
		
	}

}
