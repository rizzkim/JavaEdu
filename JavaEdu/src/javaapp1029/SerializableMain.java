package javaapp1029;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializableMain {

	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<User>();
		
//		user 데이터 생성
		User user = new User();
		user.setNum(1);
		user.setName("이세린");
		list.add(user);
		
		
		user = new User();
		user.setNum(2);
		user.setName("문은진");
		list.add(user);
		
		try {
//			인스턴스 단위로 저장할 수 있는 스트림인스턴스 생성
			ObjectOutputStream oos = 
					new ObjectOutputStream(
							new FileOutputStream("../../UserInfo.txt"));
			oos.writeObject(list);
			
			oos.close();
			
//			인스턴스 단위로 읽을 수 있는 스트림인스턴스 생성
			ObjectInputStream ois = 
					new ObjectInputStream(
							new FileInputStream("../../UserInfo.txt"));
			
			List<User> list1 = 
					(ArrayList<User>)ois.readObject();
			for(User u : list1) {
				System.out.printf("%s\n", u);
			}
			
			ois.close();
			
		} catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.getStackTrace();
		}
		

	}

}
