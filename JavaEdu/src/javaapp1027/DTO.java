package javaapp1027;

public class DTO {

	private int num;
	private String name;
	private int score;
	private String birthday;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "DTO [num=" + num + ", name=" + name + ", score=" + score + ", birthday=" + birthday + "]";
	}
	
	

}
