package javaapp1014;

public class UserMain {

	public static void main(String[] args) {
		//User 클래스의 인스턴스를 만들기
		User user1 = new User();
		User user2 = new User();
		User user3 = user1;
		
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());
		System.out.println(user3.hashCode());
		
		//user1의 프로퍼티와 메소드 호출
		user1.num = 1;
		user1.name = "adam";
		
		user1.disp();
	}

}
