package javaapp1019;

//클래스 앞에 final이 있으면 상속할 수 없다.
final class Test{
//	메소드의 앞에 final을 추가하면 overriding 할 수 없다.
	public void method() {
		System.out.printf("메소드\n");
	}
}

class TestEx extends Test{
	@Override
	public void method() {
		super.method();
		System.out.printf("기능추가\n");
	}
}

public class Final {

	public static void main(String[] args) {
		
		int n = 10;
		System.out.printf("n:%d\n", n);
		n = 20;
		System.out.printf("n:%d\n", n);
		
		final String NAME = "ADAM";
		System.out.printf("name:%s\n", NAME);
//		name = "TOM";
//		final 변수의 값은 변경할 수 없음
		
//		Test 클래스의 method 호출
		Test test = new TestEx();
		test.method();
	}

}
