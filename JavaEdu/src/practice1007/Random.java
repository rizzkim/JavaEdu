package practice1007;

public class Random {

	public static void main(String[] args) {
		String [] ar = {"대박", "꽝"};
		
		java.util.Random r = new java.util.Random();
		
		try {
			while(true) {
				Thread.sleep(1000);
				System.out.println(ar[r.nextInt()%ar.length]);
			}
		}catch(Exception e) {}

	}

}
