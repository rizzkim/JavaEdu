package javaapp1020;

public class SleepPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<=10; i=i+1) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.printf("%d\n", i);
		}
	}
}
