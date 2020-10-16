package javaapp1012;

public class Test04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt = 0;
		
		for(int su=2; su<=1000; su=su+1) {
			int sum=1;
			for(int i=2; i<=su/2; i=i+1) {
				if(su%i==0) {
					sum=sum+i;
				}
			}
			if(su==sum) {
				cnt=cnt+1;
				System.out.println("완전수: "+su);
			}
		}
		
		System.out.println("완전수의 개수: "+cnt);
	}

}
