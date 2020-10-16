package javaapp1012;

public class Toggle {

	public static void main(String[] args) {
		
		// 1초마다 ON과 OFF를 교대로 출력 - 10번만 수행
		int i = 0;
		while(i<10) {
			try {
				// 1초씩 대기
				Thread.sleep(500);
				if(i%2==0) {System.out.println("ON");}
				else {System.out.println("OFF");}
				i=i+1;
			}catch(Exception e){
				
			}	
		}

	}

}
