package javaapp1022;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
//		Member 데이터 5개를 저장할 수 있는 공간을 생성 
//		5개의 공간 각각에는 현재는 null이 저장 
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
		
		for(Member m : members) {
			System.out.printf("%s\n", m);
		}
		
		Arrays.sort(members);
		System.out.printf("=============정렬후============\n");
		
		for(Member m : members) {
			System.out.printf("%s\n", m);
		}
	}

}
