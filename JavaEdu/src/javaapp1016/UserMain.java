package javaapp1016;

public class UserMain {

	public static void main(String[] args) {
		//인스턴스 생성
		//프로그램 내의 인스턴스를 1개만 만드는 경우
		//인스턴스 이름을 클래스 이름으로 하는데 첫글자를 소문자로 변경
		//User()는 생성자를 호출하는 것입니다
		User user = new User();
		
		user.setNum(5);
		user.setId("Orignal");
		user.setPw("1234");
		user.setNickname("dd40");
		user.setName("apex");
		
		User user1=new User(2, "moonshine", "2345", "howdown", "48inch");
		System.out.println(user1);
		
		//속성의 값을 가져올 때는 get 메소드를 이용
		System.out.println(user.getId());
		System.out.println(user);
	
	}

}
