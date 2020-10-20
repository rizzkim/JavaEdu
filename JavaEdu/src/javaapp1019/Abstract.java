package javaapp1019;

abstract class Starcraft1{
	abstract public void attack();
}

class Protoss1 extends Starcraft1{
	@Override
	public void attack() {
		System.out.println("프로토스의 공격");
	}
}

class Zerg1 extends Starcraft1{
	public void attack() {
		System.out.println("저그의 공격");
	}
}

class Terran1 extends Starcraft1{
	public void attack() {
		System.out.println("테란의 공격");
	}
}

public class Abstract {
	public static void main(String[] args) {

		Starcraft1 star = new Protoss1();
		star.attack();
		
		star = new Zerg1();
		star.attack();
		
		star = new Terran1();
		star.attack();
		// 추상클래스는 new를 이용해서 인스턴스를 생성할 수 없습니다
		// 만들수 없는것과 만들지 않는 것은 차이가 있다.
		star = new Starcraft1();	// Starcraft 인스턴스 생성불가
		star.attack();


	}
}
