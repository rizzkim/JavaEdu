package practice1007;

public class Pattern {

	public static void main(String[] args) {
		try {
			int x = 0;
			while(true) {
				Thread.sleep(1000);
				if(x % 3 == 0) System.out.println("빨강");
				else if (x % 3 == 1) System.out.println("노랑");
				else if (x % 3 == 2) System.out.println("초록");
				x++;
			}
		} catch(Exception e) {
			
		}

	}

}
