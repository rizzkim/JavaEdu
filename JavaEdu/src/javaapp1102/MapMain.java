package javaapp1102;

import java.util.Comparator;
import java.util.stream.Stream;

public class MapMain {

	public static void main(String[] args) {
//		studentList의 Stream을 생성
		Stream <Student> studentStream = 
				Singleton.sharedInstance().
				getStudentList().stream();
		
//		Student를 점수만 변환
//		studentStream.mapToInt(Student::getScore).forEach(System.out::println);
		
//		sorted
//		studentStream.sorted(new Comparator<Student>() {
//
//			@Override
//			public int compare(Student arg0, Student arg1) {
//				return arg0.getScore() - arg1.getScore();
//			}
//			
//		})
//		.forEach(System.out::println);
		
		studentStream.sorted((n1, n2) -> {
			return n2.getScore() - n1.getScore();
		})
		.forEach(it -> System.out.printf("%s\n", it));

		
	}

}

