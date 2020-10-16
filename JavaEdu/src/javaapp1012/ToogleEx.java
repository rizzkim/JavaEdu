package javaapp1012;

public class ToogleEx {

	public static void main(String[] args) {
		// 1초마다 1-5번째까지는 출근, 6~7번째는 휴식이라고 번갈아가면서 출력하기
		
		int i=1;
		while (true) {
			try {
				Thread.sleep(500);
				if (i%7 == 5 || i%7 == 6) {System.out.println("휴식"+i);}
				else {System.out.println("출근"+i);}
				i=i+1;
			}catch(Exception e){
				
			}
			
		}

	}

}
