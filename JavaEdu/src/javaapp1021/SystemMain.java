package javaapp1021;

public class SystemMain {

	public static void main(String[] args) {
//		운영체제 이름을 출력 : os.name 이라는 프로퍼티 
		System.out.printf("운영체제 : %s\n", System.getProperty("os.name"));
//		자바 버전을 출력 : java.version 이라는 프로퍼티 
		System.out.printf("자바버전 : %s\n", System.getProperty("java.version"));
//		자바로 응용프로그램을 만들면 자바가 설치되어 있어야만 실행이 가능하므로
//		이 프로퍼티의 값을 확인해서 값이 없으면 자바를 설치하라고 해야 합니다.
		
//		path 라는 환경 변수의 값을 출력
//		getenv 라는 메소드 이용
		System.out.printf("path : %s\n", System.getenv("path"));
		
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000000; i++);
		long end = System.currentTimeMillis();
		System.out.printf("걸린시간 : %d\n", (end-start));
		
		start = System.nanoTime();
		for(int i=0; i<1000000000; i=i+1);
		end = System.nanoTime();
		System.out.printf("걸린시간 : %d\n", (end-start));
		
//		Runtime 인스턴스 생성 
		Runtime r = Runtime.getRuntime();
//		사용 가능 메모리 
		long freeMemory = r.freeMemory();
//		전체 메모리 
		long totalMemory = r.totalMemory();
		System.out.printf("사용가능 메모리: %s\n", freeMemory);
		System.out.printf("전체 메모리: %s\n", totalMemory);
		
		
	}

}
