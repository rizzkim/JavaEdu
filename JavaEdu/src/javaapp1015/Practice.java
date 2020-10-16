package javaapp1015;

public class Practice {
	//static 초기화 블록
	static {
		System.out.println("static : 처음 한번만 호출됩니다");
	}
	
	//instance 초기화 블록
	{
		System.out.println("instance : 인스턴스를 만들 때 마다 호출됩니다");
	}
	
	//Hello Java를 3번 출력해주는 Method 생성
	public void disp() {
		for(int i=0; i<3; i=i+1) {
			System.out.println("Hello Java");
		}
	}
	
	//정수 1개를 받아서 정수 만큼 Hello Java를 출력해주는 메소드
	public void print(int n) {
		for(int i=0; i<n; i=i+1) {
			System.out.println("Hello Java");
		}
	}
	
	public void print(double n) {
		for(int i=0; i<n; i=i+1) {
			System.out.println("Hello Java");
		}
	}
	
	//정수 2개를 받아서 합을 구하고 출력해주는 메소드
	public void add(int a, int b) {
		System.out.printf("a+b=%d\n", a+b);
	}
	
	//정수 2개를 받아서 합을 구하고 return해주는 메소드
	public int addReturn(int a, int b) {
		int result = a+b;
		return result;
	}
	
	//static 메소드
	public static void init() {
		System.out.println("static메소드는 클래스 이름으로 호출이 가능합니다.");
	}
	
	public int x = 10;	//인스턴스 변수
	
	public void thisCheck(int x) {
		//이름만 기재하면 메소드 안에서 찾아보고 없으면 메소드 바깥에서 찾습니다
		System.out.printf("local x:%d\n", x);
		
		//this를 붙이면 안에서는 찾지 않고 메소드 외부에서부터 찾습니다
		System.out.printf("this x:%d\n", this.x);
	}
	

}
