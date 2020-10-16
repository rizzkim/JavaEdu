package javaapp1014;

public class Student {
	//인스턴스 변수 - 인스턴스를 이용해서만 접근이 가능
	public int num;
	public String name;
	public String phone;
	
	//모든 학생이 공유할 학교 이름 - 클래스와 인스턴스 모두 접근 가능
	public static String school;
}
