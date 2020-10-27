package javaapp1027;

import java.util.ArrayList;
import java.util.Comparator;


public class DTOMain {

	public static void main(String[] args) {
		ArrayList<DTO> list = new ArrayList<DTO>();
		
		DTO member = new DTO();
		member.setNum(1);
		member.setName("김도형");
		member.setScore(99);
		member.setBirthday("1987.02.26");
		list.add(member);
		
		member = new DTO();
		member.setNum(2);
		member.setName("현우");
		member.setScore(77);
		member.setBirthday("1987.07.21");
		list.add(member);
		
		member = new DTO();
		member.setNum(3);
		member.setName("우영");
		member.setScore(88);
		member.setBirthday("1987.04.02");
		list.add(member);
		
		member = new DTO();
		member.setNum(4);
		member.setName("영민");
		member.setScore(44);
		member.setBirthday("1987.11.15");
		list.add(member);
		
		member = new DTO();
		member.setNum(5);
		member.setName("민수");
		member.setScore(66);
		member.setBirthday("1987.04.22");
		list.add(member);
		
		list.sort(new Comparator<DTO>() {

			@Override
			public int compare(DTO o1, DTO o2) {
				return o1.getScore()-o2.getScore();
			}
		});
		
		for(DTO temp : list) {
            System.out.printf("%s\n", temp);
        }


	}

}
