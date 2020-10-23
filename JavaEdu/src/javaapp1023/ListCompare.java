package javaapp1023;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListCompare {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();		
		al.add("0");
		al.add("2");
		
		LinkedList<String> li = new LinkedList<String>();		
		li.add("0");
		li.add("2");
		
//		LinkedList에 1을 십만번 추가 
		long start = System.nanoTime();
		for(int i=0; i<100000; i=i+1) {
			li.add(1, "1");
		}
		long end = System.nanoTime();
		System.out.printf("LinkedList: %d\n", (end-start));
		
//		ArrayList에 1을 십만번 추가 
		start = System.nanoTime();
		for(int i=0; i<100000; i=i+1) {
			al.add(1, "1");
		}
		end = System.nanoTime();
		System.out.printf("ArrayList: %d\n", (end-start));
	}

}
