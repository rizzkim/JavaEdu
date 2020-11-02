package javaapp1102;

import java.util.ArrayList;
import java.util.List;

//인스턴스를 1개만 생성할 수 있는 클래스의 디자인 패턴 - 싱글톤
//공유 자원을 소유한 클래스나 서버의 작업처리 클래스가 싱글톤으로 디자인됩니다.

public class Singleton {
//	공유할 데이터
	private List<String> strList;
	private List<Student> studentList;
	
	private Singleton() {
//		공유데이터 생성
		strList = new ArrayList<String>();
		strList.add("ollie");
		strList.add("shove-it");
		strList.add("Nocomply");
		strList.add("pivot");
		strList.add("popshove-it");
		strList.add("pivot");
		
		studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "문형경", "여자", 92));
		studentList.add(new Student(2, "다니엘", "남자", 88));
		studentList.add(new Student(3, "이수빈", "여자", 83));
		studentList.add(new Student(4, "키티", "여자", 90));
		studentList.add(new Student(5, "맹지", "남자", 95));
		studentList.add(new Student(6, "김범석", "남자", 93));
		
	}
	private static Singleton obj;
	
	public static Singleton sharedInstance() {
		if(obj == null) {
			obj = new Singleton();
		}
		return obj;
	}

	public List<String> getStrList() {
		return strList;
	}

	public List<Student> getStudentList() {
		return studentList;
	}
}
