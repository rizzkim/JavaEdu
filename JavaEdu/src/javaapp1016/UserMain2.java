package javaapp1016;

import java.util.Scanner;

public class UserMain2 {

	public static void main(String[] args) {
		// 3개의 User 인스턴스를 저장할 배열을 생성
		User [] users = new User[3];
		
		users[0] = new User(1, "Loaded", "3456", "bhangra", "48.5inch");
		
		users[1] = new User(2, "Loaded", "4567", "Tarab", "48inch");
		
		User user = new User();
		user.setNum(3);
		user.setId("Loaded");
		user.setPw("5678");
		user.setNickname("Overland");
		user.setName("36inch");
		users[2] = user;
		
		for (User temp:users) {
			System.out.println(temp);
		};

		Scanner sc = new Scanner(System.in);
		
	}

}
