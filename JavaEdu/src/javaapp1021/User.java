package javaapp1021;

public class User implements Cloneable {
	private int num;
	private String name;
	
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
	
//	num과 name의 값이 같으면 동일한 것으로 간주하도록 하는 메소드
	public boolean equals(User user) {
		if(this.num == user.num && this.name.equals(user.name)) {
			return true;
		} else {
			return false;
		}
	}
	
//	인스턴스 자신의 내용을 복제해서 리턴하는 메소드
	public User clone() {
//		새로운 인스턴스를 생성하고 현재 인스턴스의 내용을 복제
		User user = new User();
		user.num = this.num;
		user.name = this.name;
		return user;
	}
	
	@Override
	public String toString() {
		return "User [num=" + num + ", name=" + name + "]";
	}
	
}
