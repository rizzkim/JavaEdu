package javaapp1022;

public class Member implements Comparable<Member> {
	private int num;
	private String name;
	private String gender;
	private int score;
	private int age;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", gender=" + gender + ", score=" + score + ", age=" + age
				+ "]";
	}
	
	@Override
	public int compareTo(Member other) {
//		if(this.score < other.score) {
//			return 1;
//		} else if (this.score == other.score) {
//			return 0;
//		} else {
//			return -1;
//		}
		
//		return this.score-other.score;
		
//		이름으로 크기비교
//		문자열은 뺄셈이 안됩니다.
//		문자열은 이미 Comparable 인터페이스를 implements:compareTo 메소드가 존재합니다
//		return this.name.compareTo(other.name);
		
//		이름의 내림차순 정렬
		return other.name.compareTo(this.name);
	}
	
	

}
