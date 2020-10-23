package javaapp1023;

import java.util.PriorityQueue;
import java.util.Stack;

public class ListPractice {

	public static void main(String[] args) {
//		문자열 스택을 생성 
		Stack <String> stack = new Stack<String>();
		
//		데이터 추가 
		stack.push("java");
		stack.push("Database");
		stack.push("Web Programming");
		stack.push("Android");
		stack.push("IOS");
		
//		마지막에 삽입한 2개의 데이터를 출력 
		System.out.printf("%s\n", stack.pop());
		System.out.printf("%s\n", stack.pop());
		
//		우선순위 큐를 생성해서 데이터를 삽입 
//		우선순위 큐는 데이터를 정렬해서 저장하는 큐
//		실제 데이터를 정렬하는 것이 아니라 데이터를 꺼낼때 정렬합니다. 
//		poll을 하게되면 정렬을 한 것처럼 꺼냅니다. 
		
//		정수 PriorityQueue 인스턴스 생성
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
//		데이터 추가
		queue.offer(100);
		queue.offer(88);
		queue.offer(92);
		
//		전체 데이터를 출력
		System.out.printf("%s\n", queue);
		System.out.printf("%d\n", queue.poll());
		System.out.printf("%d\n", queue.poll());
		System.out.printf("%d\n", queue.poll());
		
		

	}

}
