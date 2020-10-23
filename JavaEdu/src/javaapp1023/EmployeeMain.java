package javaapp1023;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
//		Employee 인스턴스 여러 개를 저장할 수 있는 List를 생성
		ArrayList <Employee> list = new ArrayList<Employee>();
		
//		샘플 데이터 삽입
		Employee employee = new Employee();
		employee.setName("배수지");
		employee.setPosition("배우");
		employee.setOffice("수원");
		employee.setAge(28);
		list.add(employee);
		
		employee = new Employee();
		employee.setName("이시언");
		employee.setPosition("배우");
		employee.setOffice("서울");
		employee.setAge(38);
		list.add(employee);
		
		employee = new Employee();
		employee.setName("기안");
		employee.setPosition("작가");
		employee.setOffice("용인");
		employee.setAge(37);
		list.add(employee);
		
		employee = new Employee();
		employee.setName("조이");
		employee.setPosition("가수");
		employee.setOffice("제주");
		employee.setAge(25);
		list.add(employee);
		
		employee = new Employee();
		employee.setName("아담");
		employee.setPosition("가수");
		employee.setOffice("에덴");
		employee.setAge(24);
		list.add(employee);
		
//		키보드 입력을 받기 위해서 생성 
		Scanner sc = new Scanner(System.in);
		
//		무한반복
		while(true) {
			try	{
//				전체보기, 개수 지정해서 보기
//				이름으로 정렬
//				이름으로 검색
//				종료
				System.out.printf("1.전체보기 2.개수지정 3.이름으로정렬 4.이름으로검색 5.종료\n");
				System.out.printf("메뉴선택: ");
				int menu = sc.nextInt();
				
//				menu가 1~5번이 맞는지 확인 아닐시 재입력
				if(menu < 1 || menu > 5) {
					System.out.println("잘못 입력하였습니다. 다시 입력하세요.\n");
//					맨 위로 이동
					continue;
				}
				
				switch(menu) {
				case 1:
					for(Employee e : list) {
						System.out.printf("%s\n", e);
					}
					break;
				case 2:
					System.out.printf("개수지정\n");
					break;
				case 3:
					System.out.printf("이름으로 정렬\n");
					break;
				case 4:
					System.out.printf("이름으로 검색\n");
					break;
				case 5:
					System.out.printf("프로그램을 종료합니다.\n");
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.printf("잘못된 메뉴\n");
					break;
				}
				
			} catch (Exception e) {
				sc.nextLine();
				System.out.printf("메뉴는 정수로 입력하세요. \n");
			}
			
		}
	}

}
