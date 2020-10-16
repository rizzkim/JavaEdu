package javaapp1008;

public class IfEx {

	public static void main(String[] args) {
		//아이디가 root이고 비밀번호가 system 이면 로그인성공이라고 출력하고 다르면 로그인 실패라고 출력하기
		
		//1. 아이디와 비밀번호 입력받기
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.printf("아이디 : ");
		String id = sc.nextLine();
		System.out.printf("비밀번호 : ");
		String pw = sc.nextLine();
		
		//2. 아이디와 비밀번호를 비교해서 처리
		//숫자 데이터나 boolean 데이터는 ==로 일치하는지 확인하지만 문자열은 equals를 이용해서 검사
		if (id.equals("root") && pw.equals("system") ) {
			System.out.println("로그인 성공");
		} else if (!id.equals("root") && pw.equals("system") ){
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		
		sc.close();
		
	}

}
