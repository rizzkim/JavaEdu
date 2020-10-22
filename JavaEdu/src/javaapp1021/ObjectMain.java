package javaapp1021;

public class ObjectMain {

	public static void main(String[] args) {
//		User 클래스의 인스턴스를 생성하고 데이터를 설정 
		User user1 = new User();
		user1.setNum(1);
		user1.setName("도형");
		
//		번호와 이름을 확인
		System.out.printf("번호:%d\t이름:%s\n", user1.getNum(), user1.getName());

//		toString은 호출하는 메소드에 인스턴스 이름만 대입하면 호출 
		System.out.println(user1);
		System.out.printf("%s\n", user1.toString());
		
//		새로운 User 인스턴스 생성 
		User user2 = new User();
		user2.setNum(2);
		user2.setName("현우");
		
//		== 로 인스턴스 비교 
//		user1과 user2는 각각 new를 호츌했으므로 false 리턴
		System.out.printf("==:%b\n", user1 == user2);
		System.out.printf("equals:%b\n", user1.equals(user2));
		
//		새로운 User 인스턴스 생성 
		User user3 = new User();
		user3.setNum(3);
		user3.setName("주영");
		
//		user3의 참조를 user4에 대입  
		User user4 = user3;
//		user4가 name을 변경
		user4.setName("준호");
		
//		user3과 user4가 동일한 인스턴스를 참조하기때문에
//		user4가 name을 변경하면 user3에게도 동일한 효과 적용
		System.out.printf("%s\n", user3);
		System.out.printf("%s\n", user4);
		
//		user3의 내용을 복제해서 새로운 인스턴스를 user5에 대입
		User user5 = user3.clone();
		user5.setName("태호");
		System.out.printf("%s\n", user3);
		System.out.printf("%s\n", user5);
		
	}

}
