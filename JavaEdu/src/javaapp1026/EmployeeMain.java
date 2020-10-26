package javaapp1026;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class EmployeeMain {


    public static void main(String[] args) {
//		Employee 인스턴스 여러 개를 저장할 수 있는
//		List를 생성
        ArrayList<Employee> list = new ArrayList<Employee>();


//      샘플 데이터 삽입
        Employee employee = new Employee();
        employee.setName("배수지");
        employee.setPosition("배우");
        employee.setOffice("광주");
        employee.setAge(27);
        list.add(employee);


        employee = new Employee();
        employee.setName("지수");
        employee.setPosition("가수");
        employee.setOffice("군포");
        employee.setAge(26);
        list.add(employee);


        employee = new Employee();
        employee.setName("신예은");
        employee.setPosition("배우");
        employee.setOffice("속초");
        employee.setAge(23);
        list.add(employee);


        employee = new Employee();
        employee.setName("공승연");
        employee.setPosition("배우");
        employee.setOffice("수원");
        employee.setAge(28);
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


//     	키보드 입력을 받기 위해서 생성
        Scanner sc = new Scanner(System.in);
        
//      정렬 기준을 설정할 변수
        boolean flag = false;


//      무한 반복
        while (true) {
            try {
//              전체보기
//              개수를 지정해서보기
//              이름으로 정렬해서 보기
//              이름으로 검색해서 보기
//             	종료
                System.out.printf("1.전체 보기 2.개수 지정 3.이름으로 정렬" + " 4.이름으로 검색 5.종료\n");
                System.out.printf("메뉴 선택:");
                int menu = sc.nextInt();
                
//              menu가 1번부터 5번사이인지 확인
//              아닐 때는 다시 입력 받도록 작성
                if(menu < 1 || menu > 5) {
                    System.out.printf(
                        "메뉴는 1-5 사이로 입력해야 합니다.\n");
//                  맨 위로 이동
                    continue;
                }
                
                switch(menu) {
                case 1:
                    for(Employee emp : list) {
                        System.out.printf("%s\n", emp);
                    }
                    break;
                case 2:
                    while(true) {
                        try {
//                          출력 할 개수 입력받기
                            System.out.printf("출력할 개수를 입력하세요: ");
                            int cnt = sc.nextInt();
                            
//                          데이터 개수 확인
//                          1보다 작거나 데이터 개수보다 크면 데이터 개수로 설정
                            if(cnt < 1 || cnt > list.size()) {
                                System.out.printf("음수나 데이터 개수보다 "
                                    + "큰 수를 입력하면 데이터 개수로 설정합니다.\n");
                                cnt = list.size();
                            }
                            
//                          cnt 만큼 데이터를 가져와서 출력
                            for(int i=0; i<cnt; i=i+1) {
//                              출력할 때 인스턴스를 바로 출력하는 경우는
//                              toString 이라는 메소드가 호출되서 그 결과를 출력하는 것입니다.
//                              toString이 재정의 되어 있지 않으면 클래스이름 과 해시코드가 문자열로 리턴
//                              프로그래밍 언어마다 이 메소드의 이름은 다르므로 프로그래밍 언어를 공부할 때 
//                            	이러한 메소드의 이름을 알아 둘 필요가 있습니다.
                                System.out.printf("%s\n", list.get(i));
                            }
                            
                            break;
                        }catch(Exception e) {
                            System.out.printf("데이터 개수는 숫자로 입력하세요.");
                            //숫자 입력 뒤의 문자열을 제거하기 위해서
                            sc.nextLine();
                            continue;
                        }
                    
                    }
                    
                    break;
                case 3:
                    
                	if(flag==false) {
                		list.sort(new Comparator<Employee>() {
	                		@Override
	                        public int compare(Employee o1, Employee o2) {
	                            return o1.getName().compareTo(o2.getName());
	                        }
                		});
                	} else {
                		list.sort(new Comparator<Employee>() {
	                		@Override
	                		public int compare(Employee o1, Employee o2) {
	                            return o2.getName().compareTo(o1.getName());
	                        }
                		});
                	}
                	
//                	전체 데이터 출력
                	for (Employee e :list) {
                		System.out.printf("%s\n",e);
                	}
                	
//                	flag 값을 변경
                	flag = !flag;
                    break;
                case 4:
                	sc.nextLine();	// 숫자열을 받은 뒤 문자열 입력할때 입력
                    System.out.printf("검색할 이름을 입력하세요: ");
                    String name = sc.nextLine();
                    
//                  검색된 결과를 저장할 List를 생성
                    ArrayList<Employee> searchList = new ArrayList<Employee>();
                    	
                    for(Employee e : list) {
//                    	일치하는 것은 equals로 비교해서 동일한 데이터를 찾으면 searchList에 추가
//                    	if(e.getName().equals(name)) {
//                    		searchList.add(e);
//                    	}
                    	
//                    	name이 포함되어 있으면 조회
                    	if(e.getName().indexOf(name)>=0) {
                    		searchList.add(e);
                    	}
                    	
                    }
                    
//                  검색된 데이터가 없는 경우와 있는 경우로 나누어서 출력
                    if(searchList.size() == 0) {
                    	System.out.printf("일치하는 데이터가 없습니다.\n");
                    } else {
//                      검색 결과 출력
                        for(Employee e : searchList) {
                        	System.out.printf("%s\n", e);
                        }
                    }
                 
                    break;
                case 5:
//                  System.out.printf("종료\n");
                    
                    System.out.printf(
                            "프로그램을 종료합니다.\n");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.printf("잘못된 메뉴 !!!\n");
                    break;
                }
                
            } catch (Exception e) {
                sc.nextLine();
                System.out.printf("메뉴는 정수로 입력하세요!!!\n");
            }
        }


    }


}