package javaapp1028;

public class SyncMain {

	public static void main(String[] args) {
		//Runnable 인터페이스를 implements 한 ShareData를
		//이용해서 스레드를 생성하고 시작
		Thread th1 = new Thread(ShareData.sharedInstance());
		th1.start();
		
		try {
		Thread.sleep(30000);
		System.out.printf("result:%d\n", ShareData.sharedInstance().getResult());
		}catch(Exception e) {}
	}
}