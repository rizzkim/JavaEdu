package javaapp1023;

import java.util.Arrays;
import java.util.Comparator;
import javaapp1022.Member;

class ComparatorImpl implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
//		이름의 오름차순 비교 
		return o1.getName().compareTo(o2.getName());
	}
	
}

public class ArraySort {

	public static void main(String[] args) {
//		Member 배열을 생성해서 5개의 인스턴스를 대입 
		Member [] members = new Member[5];
		
		Member member = new Member();
		member.setNum(1);
		member.setName("김진희");
		member.setGender("여");
		member.setScore(97);
		member.setAge(23);
		
		members[0] = member;
		
		member = new Member();
		member.setNum(2);
		member.setName("김지홍");
		member.setGender("남");
		member.setScore(92);
		member.setAge(25);
		
		members[1] = member;
		
		member = new Member();
		member.setNum(3);
		member.setName("지민주");
		member.setGender("여");
		member.setScore(87);
		member.setAge(24);
		
		members[2] = member;
		
		member = new Member();
		member.setNum(4);
		member.setName("이수진");
		member.setGender("여");
		member.setScore(92);
		member.setAge(27);
		
		members[3] = member;
		
		member = new Member();
		member.setNum(5);
		member.setName("박종규");
		member.setGender("남");
		member.setScore(89);
		member.setAge(26);
		
		members[4] = member;
		
//		배열의 데이터를 전부 출력 
		for(Member m : members) {
			System.out.printf("%s\n", m);
		}
		
//		이름의 오름차순 정렬 
		Arrays.sort(members, new ComparatorImpl());
		System.out.printf("이름의 오름차순\n");
		for(Member m : members) {
			System.out.printf("%s\n", m);
		}
		
//		anonymous class를 이용한 이름의 내림차순 정렬 
		System.out.printf("이름의 내림차순\n");
		Arrays.sort(members, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return o2.getName().compareTo(o1.getName());
			}
		});
		for(Member m : members) {
			System.out.printf("%s\n", m);
		}
	}

}
