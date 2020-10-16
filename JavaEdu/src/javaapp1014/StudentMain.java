package javaapp1014;

public class StudentMain {

	public static void main(String[] args) {
		//Students 클래스의 인스턴스를 2개 생성
		Student student1 = new Student();
		Student student2 = new Student();
		
		//student1과 student2의 데이터 설정
		student1.num = 1;
		student1.name = "도형";
		student1.phone = "010";
		
		
		student2.num = 2;
		student2.name = "현우";
		student2.phone = "011";
		
		//인스턴스  변수는 각각 소유하기 때문에 하나의 변경이 다른 하나에 영향을 주지 않습니다.
		System.out.printf("학생1의 이름: %s\n", student1.name);
		System.out.printf("학생2의 이름: %s\n", student2.name);
		
		//static이 붙은 변수는 클래스 이름으로도 접근이 가능
		Student.school = "은평초";
		System.out.printf("학생1의 학교: %s\n", student1.school);
		System.out.printf("학생2의 학교: %s\n", student2.school);
		
		student1.school = "충암중";
		System.out.printf("학생1의 학교: %s\n", student1.school);
		System.out.printf("학생2의 학교: %s\n", student2.school);
	}

}
