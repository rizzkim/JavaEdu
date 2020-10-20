package javaapp1020;

import java.util.Date;

public class ToDayPractice {

	public static void main(String[] args) {
		//1
		for (int i=0; i<3; i=i+1) {
			double m =  Math.random();
			System.out.printf("%.1f\t",m);
		}
		System.out.printf("\n");
		
		//2
		int pi = Integer.parseInt("109") + Integer.parseInt("19");
		System.out.printf("%d", pi);
		System.out.printf("\n");
		
		
		//3
		Date date = new Date();
		System.out.printf("%s", date);
		
		
		

	}


}
