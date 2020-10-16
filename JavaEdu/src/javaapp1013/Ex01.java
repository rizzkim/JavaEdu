package javaapp1013;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names =  {"배주현", "배수지", "신예은"};
		int len = names.length;
		
		for(int i=0; i<len; i=i+1){
		    System.out.printf("%s\n",names[i]);
		}

		// names의 데이터를 순서대로 name에 하나씩 대입하고 ()안의 문장을 반복 수행
		for(String name: names){
		    System.out.printf("%s\n", name);
		}
	}

}
