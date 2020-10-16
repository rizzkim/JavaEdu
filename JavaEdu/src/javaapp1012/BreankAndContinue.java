package javaapp1012;

public class BreankAndContinue {

	public static void main(String[] args) {
		
		 for (int i=1; i<=10; i=i+1) {
//			 i값이 3의 배수가 되면 break
			 if (i % 3 == 0) {
				 break;
			 }
			 System.out.println("hello Java:"+i);
		 }
		 
		 
		 for (int i=1; i<=10; i=i+1) {
//			 i값이 3의 배수가 되면 break
			 if (i % 3 == 0) {
				 continue;
			 }
			 System.out.println("hello Java:"+i);
		 }
		 
	}
	
}
