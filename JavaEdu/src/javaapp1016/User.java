package javaapp1016;

public class User {
	private int num;
	private String id;
	private String pw;
	private String nickname;
	private String name;
	
	//매개변수가 없는 생성자
	public User() {
		System.out.printf("매개변수가 없는 생성자\n");
	}
	
	//생성자 오버로딩
	public User(int num, String id, String pw, String nickname, String name) {
		//this가 붙지 않은 변수는 메소드 내에서부터 찾고 없으면 자신의 클래스에서 찾습니다.
		//this가 붙으면 메소드 내에서는 찾지 않고 클래스에서 찾습니다.
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.nickname = nickname;
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// @Override
    // 출력하는 메소드에 인스턴스 이름을 대입하면
    // 자동으로 호출되는 메소드
    // 인스턴스 내부의 값을 빠르게 확인할 목적으로 생성
	
	public String toString() {
		return "User [num = " + num + ", id = " + id + ", pw = " + pw + ", nickname : " + nickname + ", name : " + name + "]";
		
	}
}
