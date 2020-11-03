package javaapp1103;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javaapp1103.Student;

public class StreamMain {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1, "문형경", "여자", 92));
		list.add(new Student(2, "다훈", "남자", 90));
		list.add(new Student(3, "숩니", "여자", 88));
		list.add(new Student(4, "키티", "여자", 90));
		list.add(new Student(5, "맹지", "남자", 97));
		list.add(new Student(6, "도영", "남자", 98));
		
//		성별 분류
		System.out.printf("%s\n",list.parallelStream().collect(Collectors.groupingBy(Student::getGender)));
		
//		성별로 score의 평균
		System.out.printf("%s\n", list.stream().collect(
				Collectors.groupingBy(Student::getGender, 
						Collectors.averagingDouble(Student::getScore))));
	}
}
