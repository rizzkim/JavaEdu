package javaapp1015;

public class Main {

	public static void main(String[] args) {
		//ToDo 인스턴스 생성
		ToDo player1 = new ToDo();
		ToDo player2 = new ToDo();
		
		player1.num = 1;
		player1.name = "도영";
		player1.phone = "010-1111-1111";
		
		player2.num = 2;
		player2.name = "맹지";
		player2.phone = "010-2222-2222";
		
		//static 변수에 데이터 저장하기
		ToDo.game = "freestyle";
		
		//출력
		System.out.printf("%d\t%s\t%s\t%s\n", player1.num, player1.name, player1.phone, player1.game);
		System.out.printf("%d\t%s\t%s\t%s\n", player2.num, player2.name, player2.phone, player2.game);
	}

}
