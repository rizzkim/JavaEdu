package practice1006;

public class DataType {
	
	public static void main(String[] args) {
	
		int i = 'A'+1;
		char ch = 'A'+1;
		String str ="A"+1;
		
		System.out.println("int : " + i); // 66
		System.out.println("char : " + ch); // B
		System.out.println("String : "+ str); // A1
		
		
		//overflow가 발생하여 음수가 저장됨
		int result = 2100000000+1000000000; //-1194967296
		System.out.println(result);
		
		//0.1을 100번 더했는데 10.0이 아닌 결과가 출력.
		//표현상의 한계 때문에 이런 결과가 나옵니다.
		double sum = 0.0;
		for(int k=0; k<100; k=k+1) {
			sum = sum + 0.1;
		}
		System.out.println("sum : "+sum); //sum: 9.99999999999998
		
		//int j = 10.7; // 에러입니다.
		//10.7은 double형 이라서 int에 저장할 수 없습니다.
		int j = (int)10.7;
		
		System.out.println(j);
	}
}
