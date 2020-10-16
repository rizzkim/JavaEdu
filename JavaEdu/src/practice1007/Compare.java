package practice1007;

public class Compare {

	public static void main(String[] args) {
		 
		System.out.println(10 == 10);
		System.out.println(10 != 10);
//		1.0-0.8dms 0.2인데 2개는 다르다고 나옴
		
		System.out.println((1.0-1.8)==0.1);
		
		
		
//		문자열은 ==로 비교 할 수 있는데 미리 입력된 리터럴을 비교할때는 
//		가능하지만 입력을 받아서 비교할때는 == 를 사용하면 동일한 문자열이라도
//		false가 나올 수 있기때문에 equals를 사용해야 한다
		
		String id = "adam";
		System.out.println(id == "adam");
		System.out.println(id.equals("adam"));

	}

}
