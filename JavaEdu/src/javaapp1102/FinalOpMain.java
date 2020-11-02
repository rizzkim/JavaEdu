package javaapp1102;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class FinalOpMain {
	public static void main(String[] args) {
//		공유 데이터인 StudentList를 가져와서 저장하기
		List<Student> shareList = 
				Singleton.sharedInstance().getStudentList();
		
//		점수의 합계
		System.out.printf("점수 합계: %d\n", shareList.stream()
				.mapToInt(Student::getScore).sum());
		
//		여자 점수의 합계				
		System.out.printf("여자의 점수 합계: %d\n", shareList.stream()
				.filter(it->it.getGender().equals("여자")).mapToInt(Student::getScore).sum());
		
//		점수의 평균 - Optional이라서 get 메소드를 이용해 데이터를 가져와야합니다.
		System.out.printf("점수 평균: %.2f\n", shareList.stream()
				.mapToInt(Student::getScore).average().getAsDouble());
		
//		점수가 가장 높은 데이터
		System.out.printf("최고점수를 받은 학생: %s\n", shareList.stream()
				.max((n1, n2) -> n1.getScore() - n2.getScore()).get());
		
//		여자중 가장 이름이 큰 여자 데이터
		System.out.printf("이름순이 가장 느린 여학생: %s\n", shareList.stream()
				.filter(it -> it.getGender().equals("여자"))
				.max((n1, n2) -> n1.getName().compareTo(n2.getName())).get());
	}
	
}
