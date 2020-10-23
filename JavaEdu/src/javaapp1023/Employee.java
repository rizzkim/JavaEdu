package javaapp1023;

public class Employee {
//	일련번호 생성을 위한 static 변수 
	private static int autoIncrement;
	
	private int num;	// setter메소드를 제거해서 읽기 전용으로 생성
	private String name;
	private String position;
	private String office;
	private int age;
	
	public Employee() {
//		일련번호를 만들어서 num에 저장
		autoIncrement = autoIncrement+1;
		num = autoIncrement;
	}
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + ", position=" + position + ", office=" + office + ", age="
				+ age + "]";
	}
	
}
